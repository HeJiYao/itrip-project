package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName itrip_user_link_user
*/
public class ItripUserLinkUser {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 常用联系人姓名
    */
    @ApiModelProperty("常用联系人姓名")
    @Length(max= 255,message="编码长度不能超过255")
    private String linkUserName;
    /**
    * 证件号码
    */
    @ApiModelProperty("证件号码")
    @Length(max= 255,message="编码长度不能超过255")
    private String linkIdCard;
    /**
    * 常用联系人电话
    */
    @ApiModelProperty("常用联系人电话")
    @Length(max= 255,message="编码长度不能超过255")
    private String linkPhone;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Integer userId;
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
    * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
    */
    @ApiModelProperty("证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)")
    private Integer linkIdCardType;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 常用联系人姓名
    */
    private void setLinkUserName(String linkUserName){
    this.linkUserName = linkUserName;
    }

    /**
    * 证件号码
    */
    private void setLinkIdCard(String linkIdCard){
    this.linkIdCard = linkIdCard;
    }

    /**
    * 常用联系人电话
    */
    private void setLinkPhone(String linkPhone){
    this.linkPhone = linkPhone;
    }

    /**
    * 用户id
    */
    private void setUserId(Integer userId){
    this.userId = userId;
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
    * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
    */
    private void setLinkIdCardType(Integer linkIdCardType){
    this.linkIdCardType = linkIdCardType;
    }


    /**
    * 主键
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 常用联系人姓名
    */
    private String getLinkUserName(){
    return this.linkUserName;
    }

    /**
    * 证件号码
    */
    private String getLinkIdCard(){
    return this.linkIdCard;
    }

    /**
    * 常用联系人电话
    */
    private String getLinkPhone(){
    return this.linkPhone;
    }

    /**
    * 用户id
    */
    private Integer getUserId(){
    return this.userId;
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

    /**
    * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
    */
    private Integer getLinkIdCardType(){
    return this.linkIdCardType;
    }

}
