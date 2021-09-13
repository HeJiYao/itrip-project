package com.cskt.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
* 实时库存表
* @TableName itrip_hotel_temp_store
*/
public class ItripHotelTempStore {

    /**
    * 
    */
    @ApiModelProperty("")
    private Long id;
    /**
    * 
    */
    @ApiModelProperty("")
    private Integer hotelId;
    /**
    * 商品id
    */
    @ApiModelProperty("商品id")
    private Long roomId;
    /**
    * 记录时间
    */
    @ApiModelProperty("记录时间")
    private Date recordDate;
    /**
    * 库存
    */
    @ApiModelProperty("库存")
    private Integer store;
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
    private void setHotelId(Integer hotelId){
    this.hotelId = hotelId;
    }

    /**
    * 商品id
    */
    private void setRoomId(Long roomId){
    this.roomId = roomId;
    }

    /**
    * 记录时间
    */
    private void setRecordDate(Date recordDate){
    this.recordDate = recordDate;
    }

    /**
    * 库存
    */
    private void setStore(Integer store){
    this.store = store;
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
    private Integer getHotelId(){
    return this.hotelId;
    }

    /**
    * 商品id
    */
    private Long getRoomId(){
    return this.roomId;
    }

    /**
    * 记录时间
    */
    private Date getRecordDate(){
    return this.recordDate;
    }

    /**
    * 库存
    */
    private Integer getStore(){
    return this.store;
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
