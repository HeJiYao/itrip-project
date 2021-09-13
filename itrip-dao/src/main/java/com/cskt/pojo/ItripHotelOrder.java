package com.cskt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * @TableName itrip_hotel_order
 */
@TableName(value ="itrip_hotel_order")
@Data
public class ItripHotelOrder implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "userId")
    private Long userId;

    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    @TableField(value = "orderType")
    private Integer orderType;

    /**
     * 订单号
     */
    @TableField(value = "orderNo")
    private String orderNo;

    /**
     * 交易编号
     */
    @TableField(value = "tradeNo")
    private String tradeNo;

    /**
     * 冗余字段 酒店id
     */
    @TableField(value = "hotelId")
    private Long hotelId;

    /**
     * 冗余字段 酒店名称
     */
    @TableField(value = "hotelName")
    private String hotelName;

    /**
     * 房间id
     */
    @TableField(value = "roomId")
    private Long roomId;

    /**
     * 消耗数量
     */
    @TableField(value = "count")
    private Integer count;

    /**
     * 预订天数
     */
    @TableField(value = "bookingDays")
    private Integer bookingDays;

    /**
     * 入住时间
     */
    @TableField(value = "checkInDate")
    private Date checkInDate;

    /**
     * 退房时间
     */
    @TableField(value = "checkOutDate")
    private Date checkOutDate;

    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    @TableField(value = "orderStatus")
    private Integer orderStatus;

    /**
     * 支付金额
     */
    @TableField(value = "payAmount")
    private BigDecimal payAmount;

    /**
     * 支付方式:1:支付宝 2:微信 3:到店付
     */
    @TableField(value = "payType")
    private Integer payType;

    /**
     * 联系手机号
     */
    @TableField(value = "noticePhone")
    private String noticePhone;

    /**
     * 联系邮箱
     */
    @TableField(value = "noticeEmail")
    private String noticeEmail;

    /**
     * 特殊需求
     */
    @TableField(value = "specialRequirement")
    private String specialRequirement;

    /**
     * 是否需要发票（0：不需要 1：需要）
     */
    @TableField(value = "isNeedInvoice")
    private Integer isNeedInvoice;

    /**
     * 发票类型（0：个人 1：公司）
     */
    @TableField(value = "invoiceType")
    private Integer invoiceType;

    /**
     * 发票抬头
     */
    @TableField(value = "invoiceHead")
    private String invoiceHead;

    /**
     * 入住人名称
     */
    @TableField(value = "linkUserName")
    private String linkUserName;

    /**
     * 0:WEB端 1:手机端 2:其他客户端
     */
    @TableField(value = "bookType")
    private Integer bookType;

    /**
     * 预定时间
     */
    @TableField(value = "creationDate")
    private Date creationDate;

    /**
     * 
     */
    @TableField(value = "createdBy")
    private Long createdBy;

    /**
     * 支付完成时间
     */
    @TableField(value = "modifyDate")
    private Date modifyDate;

    /**
     * 
     */
    @TableField(value = "modifiedBy")
    private Long modifiedBy;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ItripHotelOrder other = (ItripHotelOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getHotelName() == null ? other.getHotelName() == null : this.getHotelName().equals(other.getHotelName()))
            && (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getBookingDays() == null ? other.getBookingDays() == null : this.getBookingDays().equals(other.getBookingDays()))
            && (this.getCheckInDate() == null ? other.getCheckInDate() == null : this.getCheckInDate().equals(other.getCheckInDate()))
            && (this.getCheckOutDate() == null ? other.getCheckOutDate() == null : this.getCheckOutDate().equals(other.getCheckOutDate()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getNoticePhone() == null ? other.getNoticePhone() == null : this.getNoticePhone().equals(other.getNoticePhone()))
            && (this.getNoticeEmail() == null ? other.getNoticeEmail() == null : this.getNoticeEmail().equals(other.getNoticeEmail()))
            && (this.getSpecialRequirement() == null ? other.getSpecialRequirement() == null : this.getSpecialRequirement().equals(other.getSpecialRequirement()))
            && (this.getIsNeedInvoice() == null ? other.getIsNeedInvoice() == null : this.getIsNeedInvoice().equals(other.getIsNeedInvoice()))
            && (this.getInvoiceType() == null ? other.getInvoiceType() == null : this.getInvoiceType().equals(other.getInvoiceType()))
            && (this.getInvoiceHead() == null ? other.getInvoiceHead() == null : this.getInvoiceHead().equals(other.getInvoiceHead()))
            && (this.getLinkUserName() == null ? other.getLinkUserName() == null : this.getLinkUserName().equals(other.getLinkUserName()))
            && (this.getBookType() == null ? other.getBookType() == null : this.getBookType().equals(other.getBookType()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getModifiedBy() == null ? other.getModifiedBy() == null : this.getModifiedBy().equals(other.getModifiedBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getHotelName() == null) ? 0 : getHotelName().hashCode());
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getBookingDays() == null) ? 0 : getBookingDays().hashCode());
        result = prime * result + ((getCheckInDate() == null) ? 0 : getCheckInDate().hashCode());
        result = prime * result + ((getCheckOutDate() == null) ? 0 : getCheckOutDate().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getNoticePhone() == null) ? 0 : getNoticePhone().hashCode());
        result = prime * result + ((getNoticeEmail() == null) ? 0 : getNoticeEmail().hashCode());
        result = prime * result + ((getSpecialRequirement() == null) ? 0 : getSpecialRequirement().hashCode());
        result = prime * result + ((getIsNeedInvoice() == null) ? 0 : getIsNeedInvoice().hashCode());
        result = prime * result + ((getInvoiceType() == null) ? 0 : getInvoiceType().hashCode());
        result = prime * result + ((getInvoiceHead() == null) ? 0 : getInvoiceHead().hashCode());
        result = prime * result + ((getLinkUserName() == null) ? 0 : getLinkUserName().hashCode());
        result = prime * result + ((getBookType() == null) ? 0 : getBookType().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getModifiedBy() == null) ? 0 : getModifiedBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", hotelName=").append(hotelName);
        sb.append(", roomId=").append(roomId);
        sb.append(", count=").append(count);
        sb.append(", bookingDays=").append(bookingDays);
        sb.append(", checkInDate=").append(checkInDate);
        sb.append(", checkOutDate=").append(checkOutDate);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payType=").append(payType);
        sb.append(", noticePhone=").append(noticePhone);
        sb.append(", noticeEmail=").append(noticeEmail);
        sb.append(", specialRequirement=").append(specialRequirement);
        sb.append(", isNeedInvoice=").append(isNeedInvoice);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", invoiceHead=").append(invoiceHead);
        sb.append(", linkUserName=").append(linkUserName);
        sb.append(", bookType=").append(bookType);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}