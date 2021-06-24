package com.macro.mall.dto;

import lombok.Data;

/**
 * @author chenyong
 */
@Data
public class OrderStatisticsDto {

    private  int toBePaidQuantity;
    private  int toBeDeliveredQuantity;
    private  int toBeDistributionQuantity;
    private  int  inDeliveryQuantity;
    private  int  completedQuantity;
    private  int  closeQuantity;
    private  int  invalidQuantity;
}
