package com.example.sell.entity;

import java.util.Date;

public class OrderMaster {


    private Integer orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAdd;
    private String buyerOpenId;
    private Float orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;

    @Override
    public String toString() {
        return "OrderMaster{" +
                "orderId=" + orderId +
                ", buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerAdd='" + buyerAdd + '\'' +
                ", buyerOpenId='" + buyerOpenId + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderStatus=" + orderStatus +
                ", payStatus=" + payStatus +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAdd() {
        return buyerAdd;
    }

    public void setBuyerAdd(String buyerAdd) {
        this.buyerAdd = buyerAdd;
    }

    public String getBuyerOpenId() {
        return buyerOpenId;
    }

    public void setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
