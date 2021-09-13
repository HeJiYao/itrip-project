package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName itrip_hotel_extend_property
*/
public class ItripHotelExtendProperty {

    /**
    * 
    */
    @ApiModelProperty("")
    private Long id;
    /**
    * 酒店id
    */
    @ApiModelProperty("酒店id")
    private Long hotelId;
    /**
    * 推广属性
    */
    @ApiModelProperty("推广属性")
    private Long extendPropertyId;
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
    * 酒店id
    */
    private void setHotelId(Long hotelId){
    this.hotelId = hotelId;
    }

    /**
    * 推广属性
    */
    private void setExtendPropertyId(Long extendPropertyId){
    this.extendPropertyId = extendPropertyId;
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
    * 酒店id
    */
    private Long getHotelId(){
    return this.hotelId;
    }

    /**
    * 推广属性
    */
    private Long getExtendPropertyId(){
    return this.extendPropertyId;
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
