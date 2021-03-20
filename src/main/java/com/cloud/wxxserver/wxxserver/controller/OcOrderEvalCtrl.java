package com.cloud.wxxserver.wxxserver.controller;

import com.cloud.ftl.ftlbasic.webEntity.PageBean;
import com.cloud.ftl.ftlbasic.webEntity.RespEntity;
import com.cloud.ftl.ftlbasic.webEntity.CommonResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.*;
import com.cloud.wxxserver.wxxserver.service.IOcOrderEvalService;
import com.cloud.wxxserver.wxxserver.entity.OcOrderEval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Validated
@RequestMapping("/ocordereval")
@Api(tags = "全局接口信息")
public class OcOrderEvalCtrl{

    @Autowired
    private IOcOrderEvalService ocOrderEvalService;

    @GetMapping(value = "/obj")
    @ApiOperation(value = "根据主键查询" , tags = "xxx",hidden = true, notes = "author: llj")
    @ApiImplicitParam(name="commentId", value="主键",required = true)
    public CommonResp<OcOrderEval> selectById(@RequestParam("commentId") @NotNull Long commentId) {
        return RespEntity.ok(ocOrderEvalService.selectById(commentId,"没有符合条件的记录！"));
    }

    @PostMapping(value = "/list")
    @ApiOperation(value = "查询所有列表" , tags = "xxx",hidden = true, notes = "author: llj")
    public CommonResp<List<OcOrderEval>> selectList(@RequestBody OcOrderEval ocOrderEval){
        return RespEntity.ok(ocOrderEvalService.selectList(ocOrderEval));
    }

    @PostMapping(value = "/page")
    @ApiOperation(value = "分页查询" , tags = "xxx",hidden = true, notes = "author: llj")
    public CommonResp<PageBean<OcOrderEval>> selectPage(@RequestBody OcOrderEval ocOrderEval) {
        return RespEntity.ok(ocOrderEvalService.selectPage(ocOrderEval));
    }


    @PostMapping(value = "/obj")
    @ApiOperation(value = "更新或者新增", tags = "xxx",hidden = true, notes = "author: llj")
    public CommonResp<Object> save(@RequestBody OcOrderEval ocOrderEval) {
        ocOrderEvalService.save(ocOrderEval);
        return RespEntity.ok();
    }

    @DeleteMapping(value = "/obj")
    @ApiOperation(value = "根据主键删除",tags = "xxx",hidden = true, notes = "author: llj")
    @ApiImplicitParam(name="commentId", value="主键",required = true)
    public CommonResp<Object> deleteById(@RequestParam(value="commentId") @NotNull Long commentId) {
        ocOrderEvalService.deleteById(commentId);
        return RespEntity.ok();
    }

}
