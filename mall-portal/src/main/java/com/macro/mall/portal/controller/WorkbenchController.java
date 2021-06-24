package com.macro.mall.portal.controller;

import com.macro.mall.portal.service.application.WorkbenchApplication;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author chenyong
 * 工作台相关接口WorkbenchController
 */
@RestController
@Api(tags = "WorkbenchController", description = "工作台信息")
@RequestMapping("/workbench")
public class WorkbenchController {

    @Autowired
    private WorkbenchApplication workbenchApplication;

    @ApiOperation("工作台-商铺评分&订单数据")
    @GetMapping(value = "/getStoreRatingAndOrderClassifiedQuantity")
    public Object getStoreRatingAndOrderClassifiedQuantity(@RequestParam String memberId,@RequestParam String shopId) {
        return workbenchApplication.getStoreRatingAndOrderClassifiedQuantity(memberId,shopId);
    }

    @ApiOperation("工作台-今日交易数据")
    @GetMapping(value = "/getTodayTradingData")
    public Object getTodayTradingData(@RequestParam String memberId,@RequestParam String shopId) {
        return workbenchApplication.getTodayTradingData(memberId,shopId);
    }



    @ApiOperation("工作台-获取资金中心数据")
    @GetMapping(value = "/getCapitalCenterData")
    public Object getCapitalCenterData(@RequestParam String memberId,@RequestParam String shopId) {
        return workbenchApplication.getCapitalCenterData(memberId,shopId);
    }


}
