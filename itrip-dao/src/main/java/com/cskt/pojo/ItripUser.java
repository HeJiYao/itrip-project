package com.cskt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName itrip_user
 */
@TableName(value ="itrip_user")
@Data
public class ItripUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    @TableField(value = "userCode")
    private String userCode;

    /**
     * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    @TableField(value = "userPassword")
    private String userPassword;

    /**
     * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    @TableField(value = "userType")
    private Integer userType;

    /**
     * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    @TableField(value = "flatID")
    private Long flatID;

    /**
     * 用户昵称
     */
    @TableField(value = "userName")
    private String userName;

    /**
     * 微信号
     */
    @TableField(value = "weChat")
    private String weChat;

    /**
     * qq账号
     */
    @TableField(value = "QQ")
    private String QQ;

    /**
     * 微博账号
     */
    @TableField(value = "weibo")
    private String weibo;

    /**
     * 百度账号
     */
    @TableField(value = "baidu")
    private String baidu;

    /**
     * 
     */
    @TableField(value = "creationDate")
    private Date creationDate;

    /**
     * 
     */
    @TableField(value = "createdBy")
    private Long createdBy;

    /**
     * 
     */
    @TableField(value = "modifyDate")
    private Date modifyDate;

    /**
     * 
     */
    @TableField(value = "modifiedBy")
    private Long modifiedBy;

    /**
     * 是否激活,(0 false，1 true,默认是0)
     */
    @TableField(value = "activated")
    private Integer activated;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ItripUser other = (ItripUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getFlatID() == null ? other.getFlatID() == null : this.getFlatID().equals(other.getFlatID()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getWeChat() == null ? other.getWeChat() == null : this.getWeChat().equals(other.getWeChat()))
            && (this.getQQ() == null ? other.getQQ() == null : this.getQQ().equals(other.getQQ()))
            && (this.getWeibo() == null ? other.getWeibo() == null : this.getWeibo().equals(other.getWeibo()))
            && (this.getBaidu() == null ? other.getBaidu() == null : this.getBaidu().equals(other.getBaidu()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getModifiedBy() == null ? other.getModifiedBy() == null : this.getModifiedBy().equals(other.getModifiedBy()))
            && (this.getActivated() == null ? other.getActivated() == null : this.getActivated().equals(other.getActivated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getFlatID() == null) ? 0 : getFlatID().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getWeChat() == null) ? 0 : getWeChat().hashCode());
        result = prime * result + ((getQQ() == null) ? 0 : getQQ().hashCode());
        result = prime * result + ((getWeibo() == null) ? 0 : getWeibo().hashCode());
        result = prime * result + ((getBaidu() == null) ? 0 : getBaidu().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getModifiedBy() == null) ? 0 : getModifiedBy().hashCode());
        result = prime * result + ((getActivated() == null) ? 0 : getActivated().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userCode=").append(userCode);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userType=").append(userType);
        sb.append(", flatID=").append(flatID);
        sb.append(", userName=").append(userName);
        sb.append(", weChat=").append(weChat);
        sb.append(", QQ=").append(QQ);
        sb.append(", weibo=").append(weibo);
        sb.append(", baidu=").append(baidu);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", activated=").append(activated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}