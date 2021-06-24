package com.macro.mall.portal.model;

import java.io.Serializable;

public class UmsShopBaseinfo implements Serializable {
    private Integer id;

    /**
     * 商家会员id
     *
     * @mbggenerated
     */
    private Integer memberId;

    /**
     * 店铺名称
     *
     * @mbggenerated
     */
    private String shopName;

    /**
     * 店铺类型
     *
     * @mbggenerated
     */
    private Short shopType;

    /**
     * 店铺地址
     *
     * @mbggenerated
     */
    private String shopAddress;

    /**
     * 店铺负责人
     *
     * @mbggenerated
     */
    private String shopLeadingCoder;

    /**
     * 联系电话
     *
     * @mbggenerated
     */
    private String shopPhone;

    /**
     * 经营顾问
     *
     * @mbggenerated
     */
    private String shopBusinessConsultant;

    /**
     * 0 审核中 1 审核通过 2 审核识别  3 店铺异常
     *
     * @mbggenerated
     */
    private Integer shopStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Short getShopType() {
        return shopType;
    }

    public void setShopType(Short shopType) {
        this.shopType = shopType;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopLeadingCoder() {
        return shopLeadingCoder;
    }

    public void setShopLeadingCoder(String shopLeadingCoder) {
        this.shopLeadingCoder = shopLeadingCoder;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopBusinessConsultant() {
        return shopBusinessConsultant;
    }

    public void setShopBusinessConsultant(String shopBusinessConsultant) {
        this.shopBusinessConsultant = shopBusinessConsultant;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopType=").append(shopType);
        sb.append(", shopAddress=").append(shopAddress);
        sb.append(", shopLeadingCoder=").append(shopLeadingCoder);
        sb.append(", shopPhone=").append(shopPhone);
        sb.append(", shopBusinessConsultant=").append(shopBusinessConsultant);
        sb.append(", shopStatus=").append(shopStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}