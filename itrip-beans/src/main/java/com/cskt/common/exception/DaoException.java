package com.cskt.common.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author He_Ji_Yao
 * @Description: Dao 层异常
 */
@Data
@ApiModel("自定义 Dao 层异常")
public class DaoException extends RuntimeException{
    
    @ApiModelProperty("异常状态码")
    private String errorCode;
    
    public DaoException(String message,String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
    
    public DaoException(ErrorCodeEnum errorCodeEnum){
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
