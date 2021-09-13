package com.cskt.common.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author He_Ji_Yao
 * @Description: 自定义异常
 */
@Data
@ApiModel("自定义 service 层异常")
public class ServiceException extends RuntimeException{

    @ApiModelProperty("异常状态码")
    private String errorCode;
    
    public ServiceException(String message,String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
    
    public ServiceException(ErrorCodeEnum errorCodeEnum){
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
