package com.macro.mall.portal.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenyong
 */
@Data
@ApiModel(value = "资金中心数据" ,description = "资金中心数据Vo")
public class CapitalCenterVo {
    @ApiModelProperty(value = "账户余额")
    private  String AccountBalance;
    @ApiModelProperty(value = "店铺资产")
    private   String StoreAssets;
    @ApiModelProperty(value = "是否绑定资金账户  0-未绑定  1-绑定")
    private   String  bindAccountStatus;
}
