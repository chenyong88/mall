package com.macro.mall.portal.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chenyong
 */
@Data
@ApiModel(value = "今日成交数据" ,description = "今日成交数据Vo")
public class TodayTradingData  implements Serializable {

    @ApiModelProperty(value = "交易金额")
    private  String transactionAmount;
    @ApiModelProperty(value = "交易订单")
    private  String closingOrder;
    @ApiModelProperty(value = "商品访客")
    private  String merchandiseVisitors;



}
