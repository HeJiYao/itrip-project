package com.cskt.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 酒店房间表
* @TableName itrip_hotel_room
*/
public class ItripHotelRoom {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 酒店ID
    */
    @ApiModelProperty("酒店ID")
    private Long hotelId;
    /**
    * 房间名称
    */
    @ApiModelProperty("房间名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String roomTitle;
    /**
    * 房间价格
    */
    @ApiModelProperty("房间价格")
    private BigDecimal roomPrice;
    /**
    * 酒店床型
    */
    @ApiModelProperty("酒店床型")
    private Long roomBedTypeId;
    /**
    * 是否包含早餐
    */
    @ApiModelProperty("是否包含早餐")
    private Integer isHavingBreakfast;
    /**
    * 1:在线付 2:到店付 3:不限
    */
    @ApiModelProperty("1:在线付 2:到店付 3:不限")
    private Integer payType;
    /**
    * 满意度（冗余字段，在用户评论后更新）
    */
    @ApiModelProperty("满意度（冗余字段，在用户评论后更新）")
    private Long satisfaction;
    /**
    * 是否可预订(0:不可以 1:可以)
    */
    @ApiModelProperty("是否可预订(0:不可以 1:可以)")
    private Integer isBook;
    /**
    * 是否可取消(0:不可 1:可以)
    */
    @ApiModelProperty("是否可取消(0:不可 1:可以)")
    private Integer isCancel;
    /**
    * 是否及时响应(0:不及时 1:及时)
    */
    @ApiModelProperty("是否及时响应(0:不及时 1:及时)")
    private Integer isTimelyResponse;
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
    * 酒店ID
    */
    private void setHotelId(Long hotelId){
    this.hotelId = hotelId;
    }

    /**
    * 房间名称
    */
    private void setRoomTitle(String roomTitle){
    this.roomTitle = roomTitle;
    }

    /**
    * 房间价格
    */
    private void setRoomPrice(BigDecimal roomPrice){
    this.roomPrice = roomPrice;
    }

    /**
    * 酒店床型
    */
    private void setRoomBedTypeId(Long roomBedTypeId){
    this.roomBedTypeId = roomBedTypeId;
    }

    /**
    * 是否包含早餐
    */
    private void setIsHavingBreakfast(Integer isHavingBreakfast){
    this.isHavingBreakfast = isHavingBreakfast;
    }

    /**
    * 1:在线付 2:到店付 3:不限
    */
    private void setPayType(Integer payType){
    this.payType = payType;
    }

    /**
    * 满意度（冗余字段，在用户评论后更新）
    */
    private void setSatisfaction(Long satisfaction){
    this.satisfaction = satisfaction;
    }

    /**
    * 是否可预订(0:不可以 1:可以)
    */
    private void setIsBook(Integer isBook){
    this.isBook = isBook;
    }

    /**
    * 是否可取消(0:不可 1:可以)
    */
    private void setIsCancel(Integer isCancel){
    this.isCancel = isCancel;
    }

    /**
    * 是否及时响应(0:不及时 1:及时)
    */
    private void setIsTimelyResponse(Integer isTimelyResponse){
    this.isTimelyResponse = isTimelyResponse;
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
    * 酒店ID
    */
    private Long getHotelId(){
    return this.hotelId;
    }

    /**
    * 房间名称
    */
    private String getRoomTitle(){
    return this.roomTitle;
    }

    /**
    * 房间价格
    */
    private BigDecimal getRoomPrice(){
    return this.roomPrice;
    }

    /**
    * 酒店床型
    */
    private Long getRoomBedTypeId(){
    return this.roomBedTypeId;
    }

    /**
    * 是否包含早餐
    */
    private Integer getIsHavingBreakfast(){
    return this.isHavingBreakfast;
    }

    /**
    * 1:在线付 2:到店付 3:不限
    */
    private Integer getPayType(){
    return this.payType;
    }

    /**
    * 满意度（冗余字段，在用户评论后更新）
    */
    private Long getSatisfaction(){
    return this.satisfaction;
    }

    /**
    * 是否可预订(0:不可以 1:可以)
    */
    private Integer getIsBook(){
    return this.isBook;
    }

    /**
    * 是否可取消(0:不可 1:可以)
    */
    private Integer getIsCancel(){
    return this.isCancel;
    }

    /**
    * 是否及时响应(0:不及时 1:及时)
    */
    private Integer getIsTimelyResponse(){
    return this.isTimelyResponse;
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
