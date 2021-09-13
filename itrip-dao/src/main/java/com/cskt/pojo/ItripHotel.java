package com.cskt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 酒店表
 * @TableName itrip_hotel
 */
@TableName(value ="itrip_hotel")
@Data
public class ItripHotel implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 酒店名称
     */
    @TableField(value = "hotelName")
    private String hotelName;

    /**
     * 所在国家id
     */
    @TableField(value = "countryId")
    private Long countryId;

    /**
     * 所在省份id
     */
    @TableField(value = "provinceId")
    private Long provinceId;

    /**
     * 所在城市id
     */
    @TableField(value = "cityId")
    private Long cityId;

    /**
     * 酒店所在地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 酒店介绍（保存附文本）
     */
    @TableField(value = "details")
    private String details;

    /**
     * 酒店设施
     */
    @TableField(value = "facilities")
    private String facilities;

    /**
     * 酒店政策
     */
    @TableField(value = "hotelPolicy")
    private String hotelPolicy;

    /**
     * 酒店类型(1:国内酒店 2:国际酒店)
     */
    @TableField(value = "hotelType")
    private Integer hotelType;

    /**
     * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    @TableField(value = "hotelLevel")
    private Integer hotelLevel;

    /**
     * 是否是团购酒店
     */
    @TableField(value = "isGroupPurchase")
    private Integer isGroupPurchase;

    /**
     * 城市名称 冗余字段
     */
    @TableField(value = "redundantCityName")
    private String redundantCityName;

    /**
     * 省名称 冗余字段
     */
    @TableField(value = "redundantProvinceName")
    private String redundantProvinceName;

    /**
     * 国家名称 冗余字段
     */
    @TableField(value = "redundantCountryName")
    private String redundantCountryName;

    /**
     * 酒店库存（冗余，每天开定时任务的时候更新）
     */
    @TableField(value = "redundantHotelStore")
    private Integer redundantHotelStore;

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
        ItripHotel other = (ItripHotel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelName() == null ? other.getHotelName() == null : this.getHotelName().equals(other.getHotelName()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getFacilities() == null ? other.getFacilities() == null : this.getFacilities().equals(other.getFacilities()))
            && (this.getHotelPolicy() == null ? other.getHotelPolicy() == null : this.getHotelPolicy().equals(other.getHotelPolicy()))
            && (this.getHotelType() == null ? other.getHotelType() == null : this.getHotelType().equals(other.getHotelType()))
            && (this.getHotelLevel() == null ? other.getHotelLevel() == null : this.getHotelLevel().equals(other.getHotelLevel()))
            && (this.getIsGroupPurchase() == null ? other.getIsGroupPurchase() == null : this.getIsGroupPurchase().equals(other.getIsGroupPurchase()))
            && (this.getRedundantCityName() == null ? other.getRedundantCityName() == null : this.getRedundantCityName().equals(other.getRedundantCityName()))
            && (this.getRedundantProvinceName() == null ? other.getRedundantProvinceName() == null : this.getRedundantProvinceName().equals(other.getRedundantProvinceName()))
            && (this.getRedundantCountryName() == null ? other.getRedundantCountryName() == null : this.getRedundantCountryName().equals(other.getRedundantCountryName()))
            && (this.getRedundantHotelStore() == null ? other.getRedundantHotelStore() == null : this.getRedundantHotelStore().equals(other.getRedundantHotelStore()))
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
        result = prime * result + ((getHotelName() == null) ? 0 : getHotelName().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getFacilities() == null) ? 0 : getFacilities().hashCode());
        result = prime * result + ((getHotelPolicy() == null) ? 0 : getHotelPolicy().hashCode());
        result = prime * result + ((getHotelType() == null) ? 0 : getHotelType().hashCode());
        result = prime * result + ((getHotelLevel() == null) ? 0 : getHotelLevel().hashCode());
        result = prime * result + ((getIsGroupPurchase() == null) ? 0 : getIsGroupPurchase().hashCode());
        result = prime * result + ((getRedundantCityName() == null) ? 0 : getRedundantCityName().hashCode());
        result = prime * result + ((getRedundantProvinceName() == null) ? 0 : getRedundantProvinceName().hashCode());
        result = prime * result + ((getRedundantCountryName() == null) ? 0 : getRedundantCountryName().hashCode());
        result = prime * result + ((getRedundantHotelStore() == null) ? 0 : getRedundantHotelStore().hashCode());
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
        sb.append(", hotelName=").append(hotelName);
        sb.append(", countryId=").append(countryId);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", address=").append(address);
        sb.append(", details=").append(details);
        sb.append(", facilities=").append(facilities);
        sb.append(", hotelPolicy=").append(hotelPolicy);
        sb.append(", hotelType=").append(hotelType);
        sb.append(", hotelLevel=").append(hotelLevel);
        sb.append(", isGroupPurchase=").append(isGroupPurchase);
        sb.append(", redundantCityName=").append(redundantCityName);
        sb.append(", redundantProvinceName=").append(redundantProvinceName);
        sb.append(", redundantCountryName=").append(redundantCountryName);
        sb.append(", redundantHotelStore=").append(redundantHotelStore);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}