package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 区域字典表
* @TableName itrip_area_dic
*/
public class ItripAreaDic {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 区域名称
    */
    @ApiModelProperty("区域名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String name;
    /**
    * 区域编号
    */
    @ApiModelProperty("区域编号")
    @Length(max= 255,message="编码长度不能超过255")
    private String areaNo;
    /**
    * 父级区域
    */
    @ApiModelProperty("父级区域")
    private Long parent;
    /**
    * 0:未激活 1:已激活
    */
    @ApiModelProperty("0:未激活 1:已激活")
    private Integer isActivated;
    /**
    * 是否是商圈(0:不是 1:是)
    */
    @ApiModelProperty("是否是商圈(0:不是 1:是)")
    private Integer isTradingArea;
    /**
    * (0:不是 1：是)
    */
    @ApiModelProperty("(0:不是 1：是)")
    private Integer isHot;
    /**
    * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
    */
    @ApiModelProperty("区域级别(0:国家级 1:省级 2:市级 3:县/区)")
    private Integer level;
    /**
    * 1:国内 2：国外
    */
    @ApiModelProperty("1:国内 2：国外")
    private Integer isChina;
    /**
    * 
    */
    @ApiModelProperty("")
    @Length(max= 10,message="编码长度不能超过10")
    private String pinyin;
    /**
    * 
    */
    @ApiModelProperty("")
    private Date creationDate;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long createdBy;
    /**
    * 
    */
    @ApiModelProperty("")
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
    * 区域名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 区域编号
    */
    private void setAreaNo(String areaNo){
    this.areaNo = areaNo;
    }

    /**
    * 父级区域
    */
    private void setParent(Long parent){
    this.parent = parent;
    }

    /**
    * 0:未激活 1:已激活
    */
    private void setIsActivated(Integer isActivated){
    this.isActivated = isActivated;
    }

    /**
    * 是否是商圈(0:不是 1:是)
    */
    private void setIsTradingArea(Integer isTradingArea){
    this.isTradingArea = isTradingArea;
    }

    /**
    * (0:不是 1：是)
    */
    private void setIsHot(Integer isHot){
    this.isHot = isHot;
    }

    /**
    * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
    */
    private void setLevel(Integer level){
    this.level = level;
    }

    /**
    * 1:国内 2：国外
    */
    private void setIsChina(Integer isChina){
    this.isChina = isChina;
    }

    /**
    * 
    */
    private void setPinyin(String pinyin){
    this.pinyin = pinyin;
    }

    /**
    * 
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
    * 
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
    * 区域名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 区域编号
    */
    private String getAreaNo(){
    return this.areaNo;
    }

    /**
    * 父级区域
    */
    private Long getParent(){
    return this.parent;
    }

    /**
    * 0:未激活 1:已激活
    */
    private Integer getIsActivated(){
    return this.isActivated;
    }

    /**
    * 是否是商圈(0:不是 1:是)
    */
    private Integer getIsTradingArea(){
    return this.isTradingArea;
    }

    /**
    * (0:不是 1：是)
    */
    private Integer getIsHot(){
    return this.isHot;
    }

    /**
    * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
    */
    private Integer getLevel(){
    return this.level;
    }

    /**
    * 1:国内 2：国外
    */
    private Integer getIsChina(){
    return this.isChina;
    }

    /**
    * 
    */
    private String getPinyin(){
    return this.pinyin;
    }

    /**
    * 
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
    * 
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
