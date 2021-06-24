package com.macro.mall.portal.vo;


import com.macro.mall.model.UmsMember;
import com.macro.mall.portal.model.UmsShopBaseinfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回用户信息和店铺信息
 */
@Data
public class UmsUserInfoVo  implements Serializable {

    //用户信息
    private UmsMember umsMember;

    //商铺信息
    private UmsShopBaseinfo shopBaseinfo;

}
