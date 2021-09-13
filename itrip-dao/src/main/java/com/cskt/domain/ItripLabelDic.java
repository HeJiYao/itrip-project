package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 标签字典表
* @TableName itrip_label_dic
*/
public class ItripLabelDic {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * key值
    */
    @ApiModelProperty("key值")
    @Length(max= 255,message="编码长度不能超过255")
    private String name;
    /**
    * value值
    */
    @ApiModelProperty("value值")
    @Length(max= 255,message="编码长度不能超过255")
    private String value;
    /**
    * 描述
    */
    @ApiModelProperty("描述")
    @Length(max= 255,message="编码长度不能超过255")
    private String description;
    /**
    * 父级标签id(1级标签则为0)
    */
    @ApiModelProperty("父级标签id(1级标签则为0)")
    private Long parentId;
    /**
    * 标签图片地址
    */
    @ApiModelProperty("标签图片地址")
    @Length(max= 255,message="编码长度不能超过255")
    private String pic;
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
    * key值
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * value值
    */
    private void setValue(String value){
    this.value = value;
    }

    /**
    * 描述
    */
    private void setDescription(String description){
    this.description = description;
    }

    /**
    * 父级标签id(1级标签则为0)
    */
    private void setParentId(Long parentId){
    this.parentId = parentId;
    }

    /**
    * 标签图片地址
    */
    private void setPic(String pic){
    this.pic = pic;
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
    * key值
    */
    private String getName(){
    return this.name;
    }

    /**
    * value值
    */
    private String getValue(){
    return this.value;
    }

    /**
    * 描述
    */
    private String getDescription(){
    return this.description;
    }

    /**
    * 父级标签id(1级标签则为0)
    */
    private Long getParentId(){
    return this.parentId;
    }

    /**
    * 标签图片地址
    */
    private String getPic(){
    return this.pic;
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
