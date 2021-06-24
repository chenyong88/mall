package com.macro.mall.portal.controller.shop;

import com.macro.mall.portal.domain.ShopParam;
import com.macro.mall.portal.service.UmsShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品管理ontroller
 * Created by macro on 2018/8/29.
 */
@RestController
@Api(tags = "UmsShopController", description = "店铺信息")
@RequestMapping("/shop")
public class  UmsShopController {
    @Autowired
    private UmsShopService umsShopService;

    @ApiOperation("添加店铺信息")
    @RequestMapping(value = "/addShopInfo", method = RequestMethod.POST)
    @ResponseBody
    public Object addShopInfo(@RequestBody ShopParam shopParam) {
        return umsShopService.addShopInfo(shopParam);
    }





}
