package com.cskt.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 评论表
* @TableName itrip_comment
*/
public class ItripComment {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 如果产品是酒店的话 改字段保存酒店id
    */
    @ApiModelProperty("如果产品是酒店的话 改字段保存酒店id")
    private Long hotelId;
    /**
    * 商品id
    */
    @ApiModelProperty("商品id")
    private Long productId;
    /**
    * 订单id
    */
    @ApiModelProperty("订单id")
    private Long orderId;
    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    @ApiModelProperty("商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer productType;
    /**
    * 评论内容
    */
    @ApiModelProperty("评论内容")
    @Length(max= -1,message="编码长度不能超过-1")
    private String content;
    /**
    * 用户编号
    */
    @ApiModelProperty("用户编号")
    private Long userId;
    /**
    * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    */
    @ApiModelProperty("是否包含图片(当用户上传评论时检测)0:无图片 1:有图片")
    private Integer isHavingImg;
    /**
    * 位置评分
    */
    @ApiModelProperty("位置评分")
    private Integer positionScore;
    /**
    * 设施评分
    */
    @ApiModelProperty("设施评分")
    private Integer facilitiesScore;
    /**
    * 服务评分
    */
    @ApiModelProperty("服务评分")
    private Integer serviceScore;
    /**
    * 卫生评分
    */
    @ApiModelProperty("卫生评分")
    private Integer hygieneScore;
    /**
    * 综合评分
    */
    @ApiModelProperty("综合评分")
    private Integer score;
    /**
    * 出游类型
    */
    @ApiModelProperty("出游类型")
    private Long tripMode;
    /**
    * 是否满意（0：有待改善 1：值得推荐）
    */
    @ApiModelProperty("是否满意（0：有待改善 1：值得推荐）")
    private Integer isOk;
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
    * 如果产品是酒店的话 改字段保存酒店id
    */
    private void setHotelId(Long hotelId){
    this.hotelId = hotelId;
    }

    /**
    * 商品id
    */
    private void setProductId(Long productId){
    this.productId = productId;
    }

    /**
    * 订单id
    */
    private void setOrderId(Long orderId){
    this.orderId = orderId;
    }

    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    private void setProductType(Integer productType){
    this.productType = productType;
    }

    /**
    * 评论内容
    */
    private void setContent(String content){
    this.content = content;
    }

    /**
    * 用户编号
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    */
    private void setIsHavingImg(Integer isHavingImg){
    this.isHavingImg = isHavingImg;
    }

    /**
    * 位置评分
    */
    private void setPositionScore(Integer positionScore){
    this.positionScore = positionScore;
    }

    /**
    * 设施评分
    */
    private void setFacilitiesScore(Integer facilitiesScore){
    this.facilitiesScore = facilitiesScore;
    }

    /**
    * 服务评分
    */
    private void setServiceScore(Integer serviceScore){
    this.serviceScore = serviceScore;
    }

    /**
    * 卫生评分
    */
    private void setHygieneScore(Integer hygieneScore){
    this.hygieneScore = hygieneScore;
    }

    /**
    * 综合评分
    */
    private void setScore(Integer score){
    this.score = score;
    }

    /**
    * 出游类型
    */
    private void setTripMode(Long tripMode){
    this.tripMode = tripMode;
    }

    /**
    * 是否满意（0：有待改善 1：值得推荐）
    */
    private void setIsOk(Integer isOk){
    this.isOk = isOk;
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
    * 如果产品是酒店的话 改字段保存酒店id
    */
    private Long getHotelId(){
    return this.hotelId;
    }

    /**
    * 商品id
    */
    private Long getProductId(){
    return this.productId;
    }

    /**
    * 订单id
    */
    private Long getOrderId(){
    return this.orderId;
    }

    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    private Integer getProductType(){
    return this.productType;
    }

    /**
    * 评论内容
    */
    private String getContent(){
    return this.content;
    }

    /**
    * 用户编号
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    */
    private Integer getIsHavingImg(){
    return this.isHavingImg;
    }

    /**
    * 位置评分
    */
    private Integer getPositionScore(){
    return this.positionScore;
    }

    /**
    * 设施评分
    */
    private Integer getFacilitiesScore(){
    return this.facilitiesScore;
    }

    /**
    * 服务评分
    */
    private Integer getServiceScore(){
    return this.serviceScore;
    }

    /**
    * 卫生评分
    */
    private Integer getHygieneScore(){
    return this.hygieneScore;
    }

    /**
    * 综合评分
    */
    private Integer getScore(){
    return this.score;
    }

    /**
    * 出游类型
    */
    private Long getTripMode(){
    return this.tripMode;
    }

    /**
    * 是否满意（0：有待改善 1：值得推荐）
    */
    private Integer getIsOk(){
    return this.isOk;
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
