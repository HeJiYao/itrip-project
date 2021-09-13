package com.cskt.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 用户表
* @TableName itrip_user
*/
public class ItripUser {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
    */
    @ApiModelProperty("若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号")
    @Length(max= 255,message="编码长度不能超过255")
    private String userCode;
    /**
    * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    */
    @ApiModelProperty("若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码")
    @Length(max= 255,message="编码长度不能超过255")
    private String userPassword;
    /**
    * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
    */
    @ApiModelProperty("用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）")
    private Integer userType;
    /**
    * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
    */
    @ApiModelProperty("平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）")
    private Long flatID;
    /**
    * 用户昵称
    */
    @ApiModelProperty("用户昵称")
    @Length(max= 255,message="编码长度不能超过255")
    private String userName;
    /**
    * 微信号
    */
    @ApiModelProperty("微信号")
    @Length(max= 255,message="编码长度不能超过255")
    private String weChat;
    /**
    * qq账号
    */
    @ApiModelProperty("qq账号")
    @Length(max= 255,message="编码长度不能超过255")
    private String QQ;
    /**
    * 微博账号
    */
    @ApiModelProperty("微博账号")
    @Length(max= 255,message="编码长度不能超过255")
    private String weibo;
    /**
    * 百度账号
    */
    @ApiModelProperty("百度账号")
    @Length(max= 255,message="编码长度不能超过255")
    private String baidu;
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
    * 是否激活,(0 false，1 true,默认是0)
    */
    @ApiModelProperty("是否激活,(0 false，1 true,默认是0)")
    private Integer activated;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
    */
    private void setUserCode(String userCode){
    this.userCode = userCode;
    }

    /**
    * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    */
    private void setUserPassword(String userPassword){
    this.userPassword = userPassword;
    }

    /**
    * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
    */
    private void setUserType(Integer userType){
    this.userType = userType;
    }

    /**
    * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
    */
    private void setFlatID(Long flatID){
    this.flatID = flatID;
    }

    /**
    * 用户昵称
    */
    private void setUserName(String userName){
    this.userName = userName;
    }

    /**
    * 微信号
    */
    private void setWeChat(String weChat){
    this.weChat = weChat;
    }

    /**
    * qq账号
    */
    private void setQQ(String QQ){
    this.QQ = QQ;
    }

    /**
    * 微博账号
    */
    private void setWeibo(String weibo){
    this.weibo = weibo;
    }

    /**
    * 百度账号
    */
    private void setBaidu(String baidu){
    this.baidu = baidu;
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
    * 是否激活,(0 false，1 true,默认是0)
    */
    private void setActivated(Integer activated){
    this.activated = activated;
    }


    /**
    * 主键
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
    */
    private String getUserCode(){
    return this.userCode;
    }

    /**
    * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    */
    private String getUserPassword(){
    return this.userPassword;
    }

    /**
    * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
    */
    private Integer getUserType(){
    return this.userType;
    }

    /**
    * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
    */
    private Long getFlatID(){
    return this.flatID;
    }

    /**
    * 用户昵称
    */
    private String getUserName(){
    return this.userName;
    }

    /**
    * 微信号
    */
    private String getWeChat(){
    return this.weChat;
    }

    /**
    * qq账号
    */
    private String getQQ(){
    return this.QQ;
    }

    /**
    * 微博账号
    */
    private String getWeibo(){
    return this.weibo;
    }

    /**
    * 百度账号
    */
    private String getBaidu(){
    return this.baidu;
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
    * 是否激活,(0 false，1 true,默认是0)
    */
    private Integer getActivated(){
    return this.activated;
    }

}
