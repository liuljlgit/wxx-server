package com.cloud.wxxserver.wxxserver.controller;

import com.cloud.ftl.ftlbasic.webEntity.PageBean;
import com.cloud.ftl.ftlbasic.webEntity.RespEntity;
import com.cloud.ftl.ftlbasic.webEntity.CommonResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.*;
import com.cloud.wxxserver.wxxserver.service.IOcOrderCustGroupHService;
import com.cloud.wxxserver.wxxserver.entity.OcOrderCustGroupH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Validated
@RequestMapping("/ocordercustgrouph")
@Api(tags = "全局接口信息")
public class OcOrderCustGroupHCtrl{

    @Autowired
    private IOcOrderCustGroupHService ocOrderCustGroupHService;

    @GetMapping(value = "/obj")
    @ApiOperation(value = "根据主键查询" , tags = "xxx",hidden = true, notes = "author: llj")
    @ApiImplicitParam(name="orderId", value="主键",required = true)
    public CommonResp<OcOrderCustGroupH> selectById(@RequestParam("orderId") @NotNull Long orderId) {
        return RespEntity.ok(ocOrderCustGroupHService.selectById(orderId,"没有符合条件的记录！"));
    }

    @PostMapping(value = "/list")
    @ApiOperation(value = "查询所有列表" , tags = "xxx",hidden = true, notes = "author: llj")
    public CommonResp<List<OcOrderCustGroupH>> selectList(@RequestBody OcOrderCustGroupH ocOrderCustGroupH){
        return RespEntity.ok(ocOrderCustGroupHService.selectList(ocOrderCustGroupH));
    }

    @PostMapping(value = "/page")
    @ApiOperation(value = "分页查询" , tags = "xxx",hidden = true, notes = "author: llj")
    public CommonResp<PageBean<OcOrderCustGroupH>> selectPage(@RequestBody OcOrderCustGroupH ocOrderCustGroupH) {
        return RespEntity.ok(ocOrderCustGroupHService.selectPage(ocOrderCustGroupH));
    }


    @PostMapping(value = "/obj")
    @ApiOperation(value = "更新或者新增", tags = "xxx",hidden = true, notes = "author: llj")
    public CommonResp<Object> save(@RequestBody OcOrderCustGroupH ocOrderCustGroupH) {
        ocOrderCustGroupHService.save(ocOrderCustGroupH);
        return RespEntity.ok();
    }

    @DeleteMapping(value = "/obj")
    @ApiOperation(value = "根据主键删除",tags = "xxx",hidden = true, notes = "author: llj")
    @ApiImplicitParam(name="orderId", value="主键",required = true)
    public CommonResp<Object> deleteById(@RequestParam(value="orderId") @NotNull Long orderId) {
        ocOrderCustGroupHService.deleteById(orderId);
        return RespEntity.ok();
    }

}
