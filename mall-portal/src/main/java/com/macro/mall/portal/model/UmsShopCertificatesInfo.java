package com.macro.mall.portal.model;

import java.io.Serializable;
import java.util.Date;

public class UmsShopCertificatesInfo implements Serializable {
    private Integer id;

    /**
     * 店铺主键id
     *
     * @mbggenerated
     */
    private Integer shopId;

    /**
     * 身份证正面
     *
     * @mbggenerated
     */
    private String idcardPositiveImg;

    /**
     * 身份证反面
     *
     * @mbggenerated
     */
    private String idcardBackImg;

    /**
     * 营业执照
     *
     * @mbggenerated
     */
    private String businessLicense;

    /**
     * 身份证姓名
     *
     * @mbggenerated
     */
    private String idcardName;

    /**
     * 身份证号码
     *
     * @mbggenerated
     */
    private String idcardNumber;

    /**
     * 身份证期限
     *
     * @mbggenerated
     */
    private String idcardType;

    /**
     * 身份证有效期结束时间
     *
     * @mbggenerated
     */
    private Date idcardValidityEnd;

    /**
     * 有效期开始时间
     *
     * @mbggenerated
     */
    private Date idcardValidityStart;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getIdcardPositiveImg() {
        return idcardPositiveImg;
    }

    public void setIdcardPositiveImg(String idcardPositiveImg) {
        this.idcardPositiveImg = idcardPositiveImg;
    }

    public String getIdcardBackImg() {
        return idcardBackImg;
    }

    public void setIdcardBackImg(String idcardBackImg) {
        this.idcardBackImg = idcardBackImg;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getIdcardName() {
        return idcardName;
    }

    public void setIdcardName(String idcardName) {
        this.idcardName = idcardName;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    public String getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(String idcardType) {
        this.idcardType = idcardType;
    }

    public Date getIdcardValidityEnd() {
        return idcardValidityEnd;
    }

    public void setIdcardValidityEnd(Date idcardValidityEnd) {
        this.idcardValidityEnd = idcardValidityEnd;
    }

    public Date getIdcardValidityStart() {
        return idcardValidityStart;
    }

    public void setIdcardValidityStart(Date idcardValidityStart) {
        this.idcardValidityStart = idcardValidityStart;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", idcardPositiveImg=").append(idcardPositiveImg);
        sb.append(", idcardBackImg=").append(idcardBackImg);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", idcardName=").append(idcardName);
        sb.append(", idcardNumber=").append(idcardNumber);
        sb.append(", idcardType=").append(idcardType);
        sb.append(", idcardValidityEnd=").append(idcardValidityEnd);
        sb.append(", idcardValidityStart=").append(idcardValidityStart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}