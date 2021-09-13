package com.cskt.pojo;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
* @TableName itrip_trade_ends
*/
public class ItripTradeEnds {

    /**
    * 订单ID
    */
    @ApiModelProperty("订单ID")
    private Long id;
    /**
    * 订单编号(注意非支付宝交易编号tradeNo)
    */
    @ApiModelProperty("订单编号(注意非支付宝交易编号tradeNo)")
    @Length(max= 255,message="编码长度不能超过255")
    private String orderNo;
    /**
    * 标识字段(默认0：未处理；1：处理中)
    */
    @ApiModelProperty("标识字段(默认0：未处理；1：处理中)")
    private Boolean flag;

    /**
    * 订单ID
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 订单编号(注意非支付宝交易编号tradeNo)
    */
    private void setOrderNo(String orderNo){
    this.orderNo = orderNo;
    }

    /**
    * 标识字段(默认0：未处理；1：处理中)
    */
    private void setFlag(Boolean flag){
    this.flag = flag;
    }


    /**
    * 订单ID
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 订单编号(注意非支付宝交易编号tradeNo)
    */
    private String getOrderNo(){
    return this.orderNo;
    }

    /**
    * 标识字段(默认0：未处理；1：处理中)
    */
    private Boolean getFlag(){
    return this.flag;
    }

}
