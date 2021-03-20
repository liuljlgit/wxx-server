package com.cloud.wxxserver.wxxserver.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.cloud.ftl.ftlbasic.constant.PatternConst;
import com.cloud.wxxserver.wxxserver.entity.DemoData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@Validated
@RequestMapping("/export")
@Api(tags = "导出接口")
public class ExportCtrl {

    @GetMapping(value = "/batch")
    @ApiOperation(value = "批量导出数据" , notes = "作者: 刘立俊")
    public void exportBatchExcel(HttpServletResponse response){

        // 方法1 如果写到同一个sheet
        ExcelWriter excelWriter = null;
        try {
            // 这里 需要指定写用哪个class去写
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String sheetName = LocalDate.now().format(DateTimeFormatter.ofPattern(PatternConst.PURE_DATE));
            String fileName = URLEncoder.encode("订单导出数据");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            excelWriter = EasyExcel.write(response.getOutputStream(), DemoData.class)
                    .excelType(ExcelTypeEnum.XLSX)
                    .build();
            // 这里注意 如果同一个sheet只要创建一次
            WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
            // 去调用写入,这里我调用了五次，实际使用时根据数据库分页的总的页数来
            for (int i = 0; i < 1000; i++) {
                // 分页去数据库查询数据 这里可以去数据库查询每一页的数据
                List<DemoData> data = data();
                excelWriter.write(data, writeSheet);
            }
        } catch (IOException e) {
            log.info("导出异常",e);
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }

    }

    private List<DemoData> data() {
        List<DemoData> list = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            list.add(DemoData.builder()
                    .date(new Date())
                    .doubleData(Double.valueOf(12))
                    .ignore("ignore" + i)
                    .string("content" + i)
                    .build());
        }
        return list;
    }


}
