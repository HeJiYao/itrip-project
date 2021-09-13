package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 订单表
* @TableName itrip_hotel_order
*/
public class ItripHotelOrder {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long userId;
    /**
    * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    */
    @ApiModelProperty("订单类型(0:旅游产品 1:酒店产品 2：机票产品)")
    private Integer orderType;
    /**
    * 订单号
    */
    @ApiModelProperty("订单号")
    @Length(max= 255,message="编码长度不能超过255")
    private String orderNo;
    /**
    * 交易编号
    */
    @ApiModelProperty("交易编号")
    @Length(max= 255,message="编码长度不能超过255")
    private String tradeNo;
    /**
    * 冗余字段 酒店id
    */
    @ApiModelProperty("冗余字段 酒店id")
    private Long hotelId;
    /**
    * 冗余字段 酒店名称
    */
    @ApiModelProperty("冗余字段 酒店名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String hotelName;
    /**
    * 房间id
    */
    @ApiModelProperty("房间id")
    private Long roomId;
    /**
    * 消耗数量
    */
    @ApiModelProperty("消耗数量")
    private Integer count;
    /**
    * 预订天数
    */
    @ApiModelProperty("预订天数")
    private Integer bookingDays;
    /**
    * 入住时间
    */
    @ApiModelProperty("入住时间")
    private Date checkInDate;
    /**
    * 退房时间
    */
    @ApiModelProperty("退房时间")
    private Date checkOutDate;
    /**
    * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    */
    @ApiModelProperty("订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）")
    private Integer orderStatus;
    /**
    * 支付金额
    */
    @ApiModelProperty("支付金额")
    private BigDecimal payAmount;
    /**
    * 支付方式:1:支付宝 2:微信 3:到店付
    */
    @ApiModelProperty("支付方式:1:支付宝 2:微信 3:到店付")
    private Integer payType;
    /**
    * 联系手机号
    */
    @ApiModelProperty("联系手机号")
    @Length(max= 255,message="编码长度不能超过255")
    private String noticePhone;
    /**
    * 联系邮箱
    */
    @ApiModelProperty("联系邮箱")
    @Length(max= 255,message="编码长度不能超过255")
    private String noticeEmail;
    /**
    * 特殊需求
    */
    @ApiModelProperty("特殊需求")
    @Length(max= -1,message="编码长度不能超过-1")
    private String specialRequirement;
    /**
    * 是否需要发票（0：不需要 1：需要）
    */
    @ApiModelProperty("是否需要发票（0：不需要 1：需要）")
    private Integer isNeedInvoice;
    /**
    * 发票类型（0：个人 1：公司）
    */
    @ApiModelProperty("发票类型（0：个人 1：公司）")
    private Integer invoiceType;
    /**
    * 发票抬头
    */
    @ApiModelProperty("发票抬头")
    @Length(max= 255,message="编码长度不能超过255")
    private String invoiceHead;
    /**
    * 入住人名称
    */
    @ApiModelProperty("入住人名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String linkUserName;
    /**
    * 0:WEB端 1:手机端 2:其他客户端
    */
    @ApiModelProperty("0:WEB端 1:手机端 2:其他客户端")
    private Integer bookType;
    /**
    * 预定时间
    */
    @ApiModelProperty("预定时间")
    private Date creationDate;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long createdBy;
    /**
    * 支付完成时间
    */
    @ApiModelProperty("支付完成时间")
    private Date modifyDate;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long modifiedBy;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 用户id
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    */
    private void setOrderType(Integer orderType){
    this.orderType = orderType;
    }

    /**
    * 订单号
    */
    private void setOrderNo(String orderNo){
    this.orderNo = orderNo;
    }

    /**
    * 交易编号
    */
    private void setTradeNo(String tradeNo){
    this.tradeNo = tradeNo;
    }

    /**
    * 冗余字段 酒店id
    */
    private void setHotelId(Long hotelId){
    this.hotelId = hotelId;
    }

    /**
    * 冗余字段 酒店名称
    */
    private void setHotelName(String hotelName){
    this.hotelName = hotelName;
    }

    /**
    * 房间id
    */
    private void setRoomId(Long roomId){
    this.roomId = roomId;
    }

    /**
    * 消耗数量
    */
    private void setCount(Integer count){
    this.count = count;
    }

    /**
    * 预订天数
    */
    private void setBookingDays(Integer bookingDays){
    this.bookingDays = bookingDays;
    }

    /**
    * 入住时间
    */
    private void setCheckInDate(Date checkInDate){
    this.checkInDate = checkInDate;
    }

    /**
    * 退房时间
    */
    private void setCheckOutDate(Date checkOutDate){
    this.checkOutDate = checkOutDate;
    }

    /**
    * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    */
    private void setOrderStatus(Integer orderStatus){
    this.orderStatus = orderStatus;
    }

    /**
    * 支付金额
    */
    private void setPayAmount(BigDecimal payAmount){
    this.payAmount = payAmount;
    }

    /**
    * 支付方式:1:支付宝 2:微信 3:到店付
    */
    private void setPayType(Integer payType){
    this.payType = payType;
    }

    /**
    * 联系手机号
    */
    private void setNoticePhone(String noticePhone){
    this.noticePhone = noticePhone;
    }

    /**
    * 联系邮箱
    */
    private void setNoticeEmail(String noticeEmail){
    this.noticeEmail = noticeEmail;
    }

    /**
    * 特殊需求
    */
    private void setSpecialRequirement(String specialRequirement){
    this.specialRequirement = specialRequirement;
    }

    /**
    * 是否需要发票（0：不需要 1：需要）
    */
    private void setIsNeedInvoice(Integer isNeedInvoice){
    this.isNeedInvoice = isNeedInvoice;
    }

    /**
    * 发票类型（0：个人 1：公司）
    */
    private void setInvoiceType(Integer invoiceType){
    this.invoiceType = invoiceType;
    }

    /**
    * 发票抬头
    */
    private void setInvoiceHead(String invoiceHead){
    this.invoiceHead = invoiceHead;
    }

    /**
    * 入住人名称
    */
    private void setLinkUserName(String linkUserName){
    this.linkUserName = linkUserName;
    }

    /**
    * 0:WEB端 1:手机端 2:其他客户端
    */
    private void setBookType(Integer bookType){
    this.bookType = bookType;
    }

    /**
    * 预定时间
    */
    private void setCreationDate(Date creationDate){
    this.creationDate = creationDate;
    }

    /**
    * 
    */
    private void setCreatedBy(Long createdBy){
    this.createdBy = createdBy;
    }

    /**
    * 支付完成时间
    */
    private void setModifyDate(Date modifyDate){
    this.modifyDate = modifyDate;
    }

    /**
    * 
    */
    private void setModifiedBy(Long modifiedBy){
    this.modifiedBy = modifiedBy;
    }


    /**
    * 主键
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 用户id
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    */
    private Integer getOrderType(){
    return this.orderType;
    }

    /**
    * 订单号
    */
    private String getOrderNo(){
    return this.orderNo;
    }

    /**
    * 交易编号
    */
    private String getTradeNo(){
    return this.tradeNo;
    }

    /**
    * 冗余字段 酒店id
    */
    private Long getHotelId(){
    return this.hotelId;
    }

    /**
    * 冗余字段 酒店名称
    */
    private String getHotelName(){
    return this.hotelName;
    }

    /**
    * 房间id
    */
    private Long getRoomId(){
    return this.roomId;
    }

    /**
    * 消耗数量
    */
    private Integer getCount(){
    return this.count;
    }

    /**
    * 预订天数
    */
    private Integer getBookingDays(){
    return this.bookingDays;
    }

    /**
    * 入住时间
    */
    private Date getCheckInDate(){
    return this.checkInDate;
    }

    /**
    * 退房时间
    */
    private Date getCheckOutDate(){
    return this.checkOutDate;
    }

    /**
    * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    */
    private Integer getOrderStatus(){
    return this.orderStatus;
    }

    /**
    * 支付金额
    */
    private BigDecimal getPayAmount(){
    return this.payAmount;
    }

    /**
    * 支付方式:1:支付宝 2:微信 3:到店付
    */
    private Integer getPayType(){
    return this.payType;
    }

    /**
    * 联系手机号
    */
    private String getNoticePhone(){
    return this.noticePhone;
    }

    /**
    * 联系邮箱
    */
    private String getNoticeEmail(){
    return this.noticeEmail;
    }

    /**
    * 特殊需求
    */
    private String getSpecialRequirement(){
    return this.specialRequirement;
    }

    /**
    * 是否需要发票（0：不需要 1：需要）
    */
    private Integer getIsNeedInvoice(){
    return this.isNeedInvoice;
    }

    /**
    * 发票类型（0：个人 1：公司）
    */
    private Integer getInvoiceType(){
    return this.invoiceType;
    }

    /**
    * 发票抬头
    */
    private String getInvoiceHead(){
    return this.invoiceHead;
    }

    /**
    * 入住人名称
    */
    private String getLinkUserName(){
    return this.linkUserName;
    }

    /**
    * 0:WEB端 1:手机端 2:其他客户端
    */
    private Integer getBookType(){
    return this.bookType;
    }

    /**
    * 预定时间
    */
    private Date getCreationDate(){
    return this.creationDate;
    }

    /**
    * 
    */
    private Long getCreatedBy(){
    return this.createdBy;
    }

    /**
    * 支付完成时间
    */
    private Date getModifyDate(){
    return this.modifyDate;
    }

    /**
    * 
    */
    private Long getModifiedBy(){
    return this.modifiedBy;
    }

}
