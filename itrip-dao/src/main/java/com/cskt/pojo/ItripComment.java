package com.cskt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评论表
 * @TableName itrip_comment
 */
@TableName(value ="itrip_comment")
@Data
public class ItripComment implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 如果产品是酒店的话 改字段保存酒店id
     */
    @TableField(value = "hotelId")
    private Long hotelId;

    /**
     * 商品id
     */
    @TableField(value = "productId")
    private Long productId;

    /**
     * 订单id
     */
    @TableField(value = "orderId")
    private Long orderId;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    @TableField(value = "productType")
    private Integer productType;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 用户编号
     */
    @TableField(value = "userId")
    private Long userId;

    /**
     * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    @TableField(value = "isHavingImg")
    private Integer isHavingImg;

    /**
     * 位置评分
     */
    @TableField(value = "positionScore")
    private Integer positionScore;

    /**
     * 设施评分
     */
    @TableField(value = "facilitiesScore")
    private Integer facilitiesScore;

    /**
     * 服务评分
     */
    @TableField(value = "serviceScore")
    private Integer serviceScore;

    /**
     * 卫生评分
     */
    @TableField(value = "hygieneScore")
    private Integer hygieneScore;

    /**
     * 综合评分
     */
    @TableField(value = "score")
    private Integer score;

    /**
     * 出游类型
     */
    @TableField(value = "tripMode")
    private Long tripMode;

    /**
     * 是否满意（0：有待改善 1：值得推荐）
     */
    @TableField(value = "isOk")
    private Integer isOk;

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
        ItripComment other = (ItripComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIsHavingImg() == null ? other.getIsHavingImg() == null : this.getIsHavingImg().equals(other.getIsHavingImg()))
            && (this.getPositionScore() == null ? other.getPositionScore() == null : this.getPositionScore().equals(other.getPositionScore()))
            && (this.getFacilitiesScore() == null ? other.getFacilitiesScore() == null : this.getFacilitiesScore().equals(other.getFacilitiesScore()))
            && (this.getServiceScore() == null ? other.getServiceScore() == null : this.getServiceScore().equals(other.getServiceScore()))
            && (this.getHygieneScore() == null ? other.getHygieneScore() == null : this.getHygieneScore().equals(other.getHygieneScore()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getTripMode() == null ? other.getTripMode() == null : this.getTripMode().equals(other.getTripMode()))
            && (this.getIsOk() == null ? other.getIsOk() == null : this.getIsOk().equals(other.getIsOk()))
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
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIsHavingImg() == null) ? 0 : getIsHavingImg().hashCode());
        result = prime * result + ((getPositionScore() == null) ? 0 : getPositionScore().hashCode());
        result = prime * result + ((getFacilitiesScore() == null) ? 0 : getFacilitiesScore().hashCode());
        result = prime * result + ((getServiceScore() == null) ? 0 : getServiceScore().hashCode());
        result = prime * result + ((getHygieneScore() == null) ? 0 : getHygieneScore().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getTripMode() == null) ? 0 : getTripMode().hashCode());
        result = prime * result + ((getIsOk() == null) ? 0 : getIsOk().hashCode());
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
        sb.append(", productId=").append(productId);
        sb.append(", orderId=").append(orderId);
        sb.append(", productType=").append(productType);
        sb.append(", content=").append(content);
        sb.append(", userId=").append(userId);
        sb.append(", isHavingImg=").append(isHavingImg);
        sb.append(", positionScore=").append(positionScore);
        sb.append(", facilitiesScore=").append(facilitiesScore);
        sb.append(", serviceScore=").append(serviceScore);
        sb.append(", hygieneScore=").append(hygieneScore);
        sb.append(", score=").append(score);
        sb.append(", tripMode=").append(tripMode);
        sb.append(", isOk=").append(isOk);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}