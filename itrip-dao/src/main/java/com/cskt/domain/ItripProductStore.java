package com.cskt.domain;

import java.util.Date;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 原始库存表
* @TableName itrip_product_store
*/
public class ItripProductStore {

    /**
    * 
    */
    @ApiModelProperty("")
    private Long id;
    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    @ApiModelProperty("商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer productType;
    /**
    * 商品id
    */
    @ApiModelProperty("商品id")
    private Long productId;
    /**
    * 商品库存
    */
    @ApiModelProperty("商品库存")
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
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    private void setProductType(Integer productType){
    this.productType = productType;
    }

    /**
    * 商品id
    */
    private void setProductId(Long productId){
    this.productId = productId;
    }

    /**
    * 商品库存
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
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    private Integer getProductType(){
    return this.productType;
    }

    /**
    * 商品id
    */
    private Long getProductId(){
    return this.productId;
    }

    /**
    * 商品库存
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
