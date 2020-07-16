package com.david.base.enums;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 返回状态枚举
 * @author: lingjian
 * @create: 2019/7/25 14:01
 */
@Getter
@AllArgsConstructor
public enum BaseResultEnum {
  /** 返回结果状态 */
  SUCCESS(200, "操作成功"),
  FAILED(500, "操作失败"),
  VALIDATE_FAILED(404, "参数检验失败"),
  UNAUTHORIZED(401, "暂未登录或token已经过期"),
  FORBIDDEN(403, "没有相关权限");

  @ApiModelProperty(value = "状态码")
  private Integer code;

  @ApiModelProperty(value = "错误描述信息")
  private String message;
}
