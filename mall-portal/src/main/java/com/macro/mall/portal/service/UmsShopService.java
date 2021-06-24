package com.macro.mall.portal.service;


import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.domain.ShopParam;

public interface UmsShopService {
    /**
     * 添加商品信息
     * @param shopParam
     * @return
     */
    CommonResult addShopInfo(ShopParam shopParam);
}
