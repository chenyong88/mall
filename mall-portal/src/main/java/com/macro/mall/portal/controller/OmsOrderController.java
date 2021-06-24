package com.macro.mall.portal.controller;

import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.model.CmsWelcomePage;
import com.macro.mall.portal.service.OmsOrderService;
import com.macro.mall.portal.service.WelcomePageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyong
 */
@Api(tags = "OmsOrderController", description = "订单数据")
@RestController
@RequestMapping("/order")
public class OmsOrderController {

    @Autowired
    private OmsOrderService omsOrderService;



    @ApiOperation("获取订单数据列表")
    @GetMapping("/getOrderInfoList")
    public  Object getOrderInfoList(@RequestParam Integer orderStatus,@RequestParam Integer shopId,
                                    @RequestParam Integer memberId) {

        return  omsOrderService.getOrderInfoList(orderStatus,shopId,memberId);
    }


}
