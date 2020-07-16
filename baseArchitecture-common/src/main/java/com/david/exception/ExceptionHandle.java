package com.david.exception;

import com.david.base.domain.BaseResult;
import com.david.base.enums.BaseResultEnum;
import com.david.utils.ResultUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 统一的异常处理
 * @author: lingjian
 * @create: 2020/7/13 16:41
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

  @ResponseBody
  @ExceptionHandler(Exception.class)
  public BaseResult handleException(Exception e) {
    log.info("异常 {}", e);
    if (e instanceof WebException) {
      WebException exception = (WebException) e;
      Integer code = exception.getCode();
      String message = exception.getMessage();
      return ResultUtil.failed(code, message);
    }
    return ResultUtil.failed(BaseResultEnum.FAILED);
  }
}
