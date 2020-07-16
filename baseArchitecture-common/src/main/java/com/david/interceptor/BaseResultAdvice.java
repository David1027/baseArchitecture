package com.david.interceptor;

import com.david.base.domain.BaseResult;
import com.david.utils.ResultUtil;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @description: 基础返回对象过滤器
 * @author: lingjian
 * @create: 2020/7/13 16:22
 */
@ControllerAdvice
public class BaseResultAdvice implements ResponseBodyAdvice {
  @Override
  public boolean supports(MethodParameter methodParameter, Class aClass) {
    return true;
  }

  @Override
  public Object beforeBodyWrite(
      Object o,
      MethodParameter methodParameter,
      MediaType mediaType,
      Class aClass,
      ServerHttpRequest serverHttpRequest,
      ServerHttpResponse serverHttpResponse) {

    if (!(o instanceof BaseResult)) {
      return ResultUtil.success(o);
    }

    return o;
  }
}
