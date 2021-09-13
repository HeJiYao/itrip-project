package com.cskt.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 酒店表
* @TableName itrip_hotel
*/
public class ItripHotel {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 酒店名称
    */
    @ApiModelProperty("酒店名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String hotelName;
    /**
    * 所在国家id
    */
    @ApiModelProperty("所在国家id")
    private Long countryId;
    /**
    * 所在省份id
    */
    @ApiModelProperty("所在省份id")
    private Long provinceId;
    /**
    * 所在城市id
    */
    @ApiModelProperty("所在城市id")
    private Long cityId;
    /**
    * 酒店所在地址
    */
    @ApiModelProperty("酒店所在地址")
    @Length(max= 255,message="编码长度不能超过255")
    private String address;
    /**
    * 酒店介绍（保存附文本）
    */
    @ApiModelProperty("酒店介绍（保存附文本）")
    @Length(max= -1,message="编码长度不能超过-1")
    private String details;
    /**
    * 酒店设施
    */
    @ApiModelProperty("酒店设施")
    @Length(max= -1,message="编码长度不能超过-1")
    private String facilities;
    /**
    * 酒店政策
    */
    @ApiModelProperty("酒店政策")
    @Length(max= -1,message="编码长度不能超过-1")
    private String hotelPolicy;
    /**
    * 酒店类型(1:国内酒店 2:国际酒店)
    */
    @ApiModelProperty("酒店类型(1:国内酒店 2:国际酒店)")
    private Integer hotelType;
    /**
    * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
    */
    @ApiModelProperty("(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)")
    private Integer hotelLevel;
    /**
    * 是否是团购酒店
    */
    @ApiModelProperty("是否是团购酒店")
    private Integer isGroupPurchase;
    /**
    * 城市名称 冗余字段
    */
    @ApiModelProperty("城市名称 冗余字段")
    @Length(max= 255,message="编码长度不能超过255")
    private String redundantCityName;
    /**
    * 省名称 冗余字段
    */
    @ApiModelProperty("省名称 冗余字段")
    @Length(max= 255,message="编码长度不能超过255")
    private String redundantProvinceName;
    /**
    * 国家名称 冗余字段
    */
    @ApiModelProperty("国家名称 冗余字段")
    @Length(max= 255,message="编码长度不能超过255")
    private String redundantCountryName;
    /**
    * 酒店库存（冗余，每天开定时任务的时候更新）
    */
    @ApiModelProperty("酒店库存（冗余，每天开定时任务的时候更新）")
    private Integer redundantHotelStore;
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
    * 酒店名称
    */
    private void setHotelName(String hotelName){
    this.hotelName = hotelName;
    }

    /**
    * 所在国家id
    */
    private void setCountryId(Long countryId){
    this.countryId = countryId;
    }

    /**
    * 所在省份id
    */
    private void setProvinceId(Long provinceId){
    this.provinceId = provinceId;
    }

    /**
    * 所在城市id
    */
    private void setCityId(Long cityId){
    this.cityId = cityId;
    }

    /**
    * 酒店所在地址
    */
    private void setAddress(String address){
    this.address = address;
    }

    /**
    * 酒店介绍（保存附文本）
    */
    private void setDetails(String details){
    this.details = details;
    }

    /**
    * 酒店设施
    */
    private void setFacilities(String facilities){
    this.facilities = facilities;
    }

    /**
    * 酒店政策
    */
    private void setHotelPolicy(String hotelPolicy){
    this.hotelPolicy = hotelPolicy;
    }

    /**
    * 酒店类型(1:国内酒店 2:国际酒店)
    */
    private void setHotelType(Integer hotelType){
    this.hotelType = hotelType;
    }

    /**
    * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
    */
    private void setHotelLevel(Integer hotelLevel){
    this.hotelLevel = hotelLevel;
    }

    /**
    * 是否是团购酒店
    */
    private void setIsGroupPurchase(Integer isGroupPurchase){
    this.isGroupPurchase = isGroupPurchase;
    }

    /**
    * 城市名称 冗余字段
    */
    private void setRedundantCityName(String redundantCityName){
    this.redundantCityName = redundantCityName;
    }

    /**
    * 省名称 冗余字段
    */
    private void setRedundantProvinceName(String redundantProvinceName){
    this.redundantProvinceName = redundantProvinceName;
    }

    /**
    * 国家名称 冗余字段
    */
    private void setRedundantCountryName(String redundantCountryName){
    this.redundantCountryName = redundantCountryName;
    }

    /**
    * 酒店库存（冗余，每天开定时任务的时候更新）
    */
    private void setRedundantHotelStore(Integer redundantHotelStore){
    this.redundantHotelStore = redundantHotelStore;
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
    * 酒店名称
    */
    private String getHotelName(){
    return this.hotelName;
    }

    /**
    * 所在国家id
    */
    private Long getCountryId(){
    return this.countryId;
    }

    /**
    * 所在省份id
    */
    private Long getProvinceId(){
    return this.provinceId;
    }

    /**
    * 所在城市id
    */
    private Long getCityId(){
    return this.cityId;
    }

    /**
    * 酒店所在地址
    */
    private String getAddress(){
    return this.address;
    }

    /**
    * 酒店介绍（保存附文本）
    */
    private String getDetails(){
    return this.details;
    }

    /**
    * 酒店设施
    */
    private String getFacilities(){
    return this.facilities;
    }

    /**
    * 酒店政策
    */
    private String getHotelPolicy(){
    return this.hotelPolicy;
    }

    /**
    * 酒店类型(1:国内酒店 2:国际酒店)
    */
    private Integer getHotelType(){
    return this.hotelType;
    }

    /**
    * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
    */
    private Integer getHotelLevel(){
    return this.hotelLevel;
    }

    /**
    * 是否是团购酒店
    */
    private Integer getIsGroupPurchase(){
    return this.isGroupPurchase;
    }

    /**
    * 城市名称 冗余字段
    */
    private String getRedundantCityName(){
    return this.redundantCityName;
    }

    /**
    * 省名称 冗余字段
    */
    private String getRedundantProvinceName(){
    return this.redundantProvinceName;
    }

    /**
    * 国家名称 冗余字段
    */
    private String getRedundantCountryName(){
    return this.redundantCountryName;
    }

    /**
    * 酒店库存（冗余，每天开定时任务的时候更新）
    */
    private Integer getRedundantHotelStore(){
    return this.redundantHotelStore;
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
