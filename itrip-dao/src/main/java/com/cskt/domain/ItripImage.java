package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 图片表
* @TableName itrip_image
*/
public class ItripImage {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 图片类型(0:酒店图片1:房间图片2:评论图片)
    */
    @ApiModelProperty("图片类型(0:酒店图片1:房间图片2:评论图片)")
    @Length(max= 255,message="编码长度不能超过255")
    private String type;
    /**
    * 关联id
    */
    @ApiModelProperty("关联id")
    private Long targetId;
    /**
    * 图片s上传顺序位置
    */
    @ApiModelProperty("图片s上传顺序位置")
    private Integer position;
    /**
    * 图片地址
    */
    @ApiModelProperty("图片地址")
    @Length(max= 255,message="编码长度不能超过255")
    private String imgUrl;
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
    * 图片类型(0:酒店图片1:房间图片2:评论图片)
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 关联id
    */
    private void setTargetId(Long targetId){
    this.targetId = targetId;
    }

    /**
    * 图片s上传顺序位置
    */
    private void setPosition(Integer position){
    this.position = position;
    }

    /**
    * 图片地址
    */
    private void setImgUrl(String imgUrl){
    this.imgUrl = imgUrl;
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
    * 图片类型(0:酒店图片1:房间图片2:评论图片)
    */
    private String getType(){
    return this.type;
    }

    /**
    * 关联id
    */
    private Long getTargetId(){
    return this.targetId;
    }

    /**
    * 图片s上传顺序位置
    */
    private Integer getPosition(){
    return this.position;
    }

    /**
    * 图片地址
    */
    private String getImgUrl(){
    return this.imgUrl;
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
