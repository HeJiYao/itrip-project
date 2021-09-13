package com.cskt.common.handler;

import com.cskt.common.constants.ErrorCodeEnum;
import com.cskt.common.exception.DaoException;
import com.cskt.common.exception.ServiceException;
import com.cskt.common.vo.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author He_Ji_Yao
 * @Description: 统一异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    /**
     * 捕获异常
     *
     * @param e 异常类型为 Exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ReturnResult error(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }
    
    /**
     * 捕获异常
     *
     * @param e 异常类型为 ServiceException
     * @return
     */
    @ExceptionHandler(ServiceException.class)
    public ReturnResult error(ServiceException e) {
        LOGGER.error(e.getErrorCode(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }
    
    /**
     * 捕获异常
     *
     * @param e 异常类型为 DaoException
     * @return
     */
    @ExceptionHandler(DaoException.class)
    public ReturnResult error(DaoException e) {
        LOGGER.error(e.getErrorCode(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }
}
