package com.macro.mall.portal.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenyong
 */
@Data
@ApiModel(value = "订单数据统计" ,description = "订单数据统计Vo")
public class OrderStatisticsVo {

    @ApiModelProperty(value = "待支付")
    private  int toBePaidQuantity;
    @ApiModelProperty(value = "待发货")
    private  int toBeDeliveredQuantity;
    @ApiModelProperty(value = "待配送")
    private  int toBeDistributionQuantity;
    @ApiModelProperty(value = "配送中")
    private  int  inDeliveryQuantity;
    @ApiModelProperty(value = "已完成")
    private  int  completedQuantity;
    @ApiModelProperty(value = "已关闭订单")
    private  int  closeQuantity;
    @ApiModelProperty(value = "无效订单")
    private  int  invalidQuantity;


}
