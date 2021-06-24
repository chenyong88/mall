package com.macro.mall.model;

import java.io.Serializable;

public class UmsShopBankInfo implements Serializable {
    private Long id;

    /**
     * 商铺id
     *
     * @mbggenerated
     */
    private Long shopId;

    /**
     * 商家账户id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * 银行卡号
     *
     * @mbggenerated
     */
    private String bankCardNum;

    /**
     * 开户银行
     *
     * @mbggenerated
     */
    private String depositBank;

    /**
     * 开户网点
     *
     * @mbggenerated
     */
    private String depositNet;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 账户类型 0- 个人 1-公司
     *
     * @mbggenerated
     */
    private Integer accountType;

    /**
     * 账号名称
     *
     * @mbggenerated
     */
    private String name;

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
     * 账户状态 0-正常  1-删除
     *
     * @mbggenerated
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getDepositNet() {
        return depositNet;
    }

    public void setDepositNet(String depositNet) {
        this.depositNet = depositNet;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", memberId=").append(memberId);
        sb.append(", bankCardNum=").append(bankCardNum);
        sb.append(", depositBank=").append(depositBank);
        sb.append(", depositNet=").append(depositNet);
        sb.append(", phone=").append(phone);
        sb.append(", accountType=").append(accountType);
        sb.append(", name=").append(name);
        sb.append(", idcardName=").append(idcardName);
        sb.append(", idcardNumber=").append(idcardNumber);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}