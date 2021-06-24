package com.macro.mall.portal.domain;

import com.macro.mall.portal.model.UmsShopBaseinfo;
import com.macro.mall.portal.model.UmsShopCertificatesInfo;
import lombok.Data;

/**
 * 商铺信息入参
 */
@Data
public class ShopParam {

    private UmsShopBaseinfo shopBaseinfo;

    private UmsShopCertificatesInfo shopCertificatesInfo;

}
