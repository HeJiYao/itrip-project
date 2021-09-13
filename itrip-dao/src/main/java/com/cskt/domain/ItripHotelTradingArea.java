package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName itrip_hotel_trading_area
*/
public class ItripHotelTradingArea {

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
    * 商圈id
    */
    @ApiModelProperty("商圈id")
    private Long areaId;
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
    * 商圈id
    */
    private void setAreaId(Long areaId){
    this.areaId = areaId;
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
    * 商圈id
    */
    private Long getAreaId(){
    return this.areaId;
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
