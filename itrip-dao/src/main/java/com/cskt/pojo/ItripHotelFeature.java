package com.cskt.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
* 
* @TableName itrip_hotel_feature
*/
public class ItripHotelFeature {

    /**
    * 
    */
    @ApiModelProperty("")
    private Long id;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long hotelId;
    /**
    * 
    */
    @ApiModelProperty("")
    private Long featureId;
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
    * 
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 
    */
    private void setHotelId(Long hotelId){
    this.hotelId = hotelId;
    }

    /**
    * 
    */
    private void setFeatureId(Long featureId){
    this.featureId = featureId;
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
    * 
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 
    */
    private Long getHotelId(){
    return this.hotelId;
    }

    /**
    * 
    */
    private Long getFeatureId(){
    return this.featureId;
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
