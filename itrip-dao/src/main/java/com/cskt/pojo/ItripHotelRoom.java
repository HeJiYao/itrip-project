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
 * 酒店房间表
 * @TableName itrip_hotel_room
 */
@TableName(value ="itrip_hotel_room")
@Data
public class ItripHotelRoom implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 酒店ID
     */
    @TableField(value = "hotelId")
    private Long hotelId;

    /**
     * 房间名称
     */
    @TableField(value = "roomTitle")
    private String roomTitle;

    /**
     * 房间价格
     */
    @TableField(value = "roomPrice")
    private BigDecimal roomPrice;

    /**
     * 酒店床型
     */
    @TableField(value = "roomBedTypeId")
    private Long roomBedTypeId;

    /**
     * 是否包含早餐
     */
    @TableField(value = "isHavingBreakfast")
    private Integer isHavingBreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    @TableField(value = "payType")
    private Integer payType;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    @TableField(value = "satisfaction")
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    @TableField(value = "isBook")
    private Integer isBook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    @TableField(value = "isCancel")
    private Integer isCancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    @TableField(value = "isTimelyResponse")
    private Integer isTimelyResponse;

    /**
     * 
     */
    @TableField(value = "creationDate")
    private Date creationDate;

    /**
     * 
     */
    @TableField(value = "createdBy")
    private Long createdBy;

    /**
     * 
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
        ItripHotelRoom other = (ItripHotelRoom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getRoomTitle() == null ? other.getRoomTitle() == null : this.getRoomTitle().equals(other.getRoomTitle()))
            && (this.getRoomPrice() == null ? other.getRoomPrice() == null : this.getRoomPrice().equals(other.getRoomPrice()))
            && (this.getRoomBedTypeId() == null ? other.getRoomBedTypeId() == null : this.getRoomBedTypeId().equals(other.getRoomBedTypeId()))
            && (this.getIsHavingBreakfast() == null ? other.getIsHavingBreakfast() == null : this.getIsHavingBreakfast().equals(other.getIsHavingBreakfast()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getSatisfaction() == null ? other.getSatisfaction() == null : this.getSatisfaction().equals(other.getSatisfaction()))
            && (this.getIsBook() == null ? other.getIsBook() == null : this.getIsBook().equals(other.getIsBook()))
            && (this.getIsCancel() == null ? other.getIsCancel() == null : this.getIsCancel().equals(other.getIsCancel()))
            && (this.getIsTimelyResponse() == null ? other.getIsTimelyResponse() == null : this.getIsTimelyResponse().equals(other.getIsTimelyResponse()))
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
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getRoomTitle() == null) ? 0 : getRoomTitle().hashCode());
        result = prime * result + ((getRoomPrice() == null) ? 0 : getRoomPrice().hashCode());
        result = prime * result + ((getRoomBedTypeId() == null) ? 0 : getRoomBedTypeId().hashCode());
        result = prime * result + ((getIsHavingBreakfast() == null) ? 0 : getIsHavingBreakfast().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getSatisfaction() == null) ? 0 : getSatisfaction().hashCode());
        result = prime * result + ((getIsBook() == null) ? 0 : getIsBook().hashCode());
        result = prime * result + ((getIsCancel() == null) ? 0 : getIsCancel().hashCode());
        result = prime * result + ((getIsTimelyResponse() == null) ? 0 : getIsTimelyResponse().hashCode());
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
        sb.append(", hotelId=").append(hotelId);
        sb.append(", roomTitle=").append(roomTitle);
        sb.append(", roomPrice=").append(roomPrice);
        sb.append(", roomBedTypeId=").append(roomBedTypeId);
        sb.append(", isHavingBreakfast=").append(isHavingBreakfast);
        sb.append(", payType=").append(payType);
        sb.append(", satisfaction=").append(satisfaction);
        sb.append(", isBook=").append(isBook);
        sb.append(", isCancel=").append(isCancel);
        sb.append(", isTimelyResponse=").append(isTimelyResponse);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}