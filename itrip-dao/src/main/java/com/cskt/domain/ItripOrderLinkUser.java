package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName itrip_order_link_user
*/
public class ItripOrderLinkUser {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 订单id
    */
    @ApiModelProperty("订单id")
    private Long orderId;
    /**
    * 联系人id
    */
    @ApiModelProperty("联系人id")
    private Long linkUserId;
    /**
    * 入住人姓名逗号分隔
    */
    @ApiModelProperty("入住人姓名逗号分隔")
    @Length(max= 128,message="编码长度不能超过128")
    private String linkUserName;
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
    * 订单id
    */
    private void setOrderId(Long orderId){
    this.orderId = orderId;
    }

    /**
    * 联系人id
    */
    private void setLinkUserId(Long linkUserId){
    this.linkUserId = linkUserId;
    }

    /**
    * 入住人姓名逗号分隔
    */
    private void setLinkUserName(String linkUserName){
    this.linkUserName = linkUserName;
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
    * 订单id
    */
    private Long getOrderId(){
    return this.orderId;
    }

    /**
    * 联系人id
    */
    private Long getLinkUserId(){
    return this.linkUserId;
    }

    /**
    * 入住人姓名逗号分隔
    */
    private String getLinkUserName(){
    return this.linkUserName;
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
