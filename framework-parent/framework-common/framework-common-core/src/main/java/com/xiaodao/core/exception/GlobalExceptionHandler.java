package com.xiaodao.core.exception;


import com.xiaodao.core.result.RespVO;
import com.xiaodao.core.result.RespVOBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 *
 * @author zmr
 * @author lucas
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 请求方式不支持
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED)
    public RespVO handleException(HttpRequestMethodNotSupportedException e) {
        logger.error(e.getMessage(), e);
        return RespVOBuilder.failure("不支持' " + e.getMethod() + "'请求");
    }

    /**
     * 拦截未知的运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    public RespVO notFount(RuntimeException e) {
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        logger.error("运行时异常:", e);
        return RespVOBuilder.failure("运行时异常:" + e.getMessage());
    }

    /**
     * 处理自定义异常
     */
    @ExceptionHandler(XiaodaoException.class)
    public RespVO handleWindException(XiaodaoException e) {
        return RespVOBuilder.failure(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(DuplicateKeyException.class)
    public RespVO handleDuplicateKeyException(DuplicateKeyException e) {
        logger.error(e.getMessage(), e);
        return RespVOBuilder.failure("数据库中已存在该记录");
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public RespVO handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        logger.error(e.getMessage(), e);
        return RespVOBuilder.failure(e.getMessage());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RespVO handleMethodArgumentNotValidException(MethodArgumentNotValidException e) throws Exception {
        logger.error(e.getMessage(), e);
        return RespVOBuilder.failure(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(Exception.class)
    public RespVO handleException(Exception e) throws Exception {
        logger.error(e.getMessage(), e);
        return RespVOBuilder.failure("服务器错误，请联系管理员");
    }

    /**
     * 捕获并处理未授权异常
     *
     * @param e 授权异常
     * @return 统一封装的结果类, 含有代码code和提示信息msg
     */
    @ExceptionHandler(UnauthorizedException.class)
    public RespVO handle401(UnauthorizedException e) {
        return RespVOBuilder.failure(401, e.getMessage());
    }

    // 验证码错误
    @ExceptionHandler(ValidateCodeException.class)
    public RespVO handleCaptcha(ValidateCodeException e) {
        return RespVOBuilder.failure(e.getMessage());
    }
}