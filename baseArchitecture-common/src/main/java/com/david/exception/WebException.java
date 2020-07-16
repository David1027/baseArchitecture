package com.david.exception;

import com.david.base.enums.BaseResultEnum;

import lombok.Data;

/**
 * @description: 自定义异常类
 * @author: lingjian
 * @create: 2020/7/13 16:41
 */
@Data
public class WebException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  private Integer code;

  public WebException(Integer code, String message) {
    super(message);
    this.code = code;
  }

  public WebException(BaseResultEnum resultEnum) {
    super(resultEnum.getMessage());
    this.code = resultEnum.getCode();
  }
}
