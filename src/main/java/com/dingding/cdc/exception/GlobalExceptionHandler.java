package com.dingding.cdc.exception;

import com.dingding.cdc.dto.ResultCod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liudingding
 * @date 2019/1/17
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ResultCod<String> ErrorHandler(MyException e) {
        ResultCod<String> r = new ResultCod<>(com.dingding.cdc.enums.ResultCode.NOT_FOUND);
        logger.error(e.getMessage());
        return r;
    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public ResultCod<String> illegalArgumentException(IllegalArgumentException e) {
        ResultCod<String> r = new ResultCod<>();
        logger.error(e.getMessage());
        r.setMessage(e.getMessage());
        return r;
    }
}
