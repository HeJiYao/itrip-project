package com.cskt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 区域字典表
 * @TableName itrip_area_dic
 */
@TableName(value ="itrip_area_dic")
@Data
public class ItripAreaDic implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 区域名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 区域编号
     */
    @TableField(value = "areaNo")
    private String areaNo;

    /**
     * 父级区域
     */
    @TableField(value = "parent")
    private Long parent;

    /**
     * 0:未激活 1:已激活
     */
    @TableField(value = "isActivated")
    private Integer isActivated;

    /**
     * 是否是商圈(0:不是 1:是)
     */
    @TableField(value = "isTradingArea")
    private Integer isTradingArea;

    /**
     * (0:不是 1：是)
     */
    @TableField(value = "isHot")
    private Integer isHot;

    /**
     * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 1:国内 2：国外
     */
    @TableField(value = "isChina")
    private Integer isChina;

    /**
     * 
     */
    @TableField(value = "pinyin")
    private String pinyin;

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
        ItripAreaDic other = (ItripAreaDic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAreaNo() == null ? other.getAreaNo() == null : this.getAreaNo().equals(other.getAreaNo()))
            && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
            && (this.getIsActivated() == null ? other.getIsActivated() == null : this.getIsActivated().equals(other.getIsActivated()))
            && (this.getIsTradingArea() == null ? other.getIsTradingArea() == null : this.getIsTradingArea().equals(other.getIsTradingArea()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getIsChina() == null ? other.getIsChina() == null : this.getIsChina().equals(other.getIsChina()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAreaNo() == null) ? 0 : getAreaNo().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getIsActivated() == null) ? 0 : getIsActivated().hashCode());
        result = prime * result + ((getIsTradingArea() == null) ? 0 : getIsTradingArea().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getIsChina() == null) ? 0 : getIsChina().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", areaNo=").append(areaNo);
        sb.append(", parent=").append(parent);
        sb.append(", isActivated=").append(isActivated);
        sb.append(", isTradingArea=").append(isTradingArea);
        sb.append(", isHot=").append(isHot);
        sb.append(", level=").append(level);
        sb.append(", isChina=").append(isChina);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}