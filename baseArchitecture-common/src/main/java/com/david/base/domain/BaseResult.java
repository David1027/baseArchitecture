package com.david.base.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 结果返回基础类
 * @author: lingjian
 * @create: 2020/7/13 16:16
 */
@Data
@ApiModel("结果返回基础类")
public class BaseResult<T> {

  @ApiModelProperty(value = "状态码")
  private Integer code;

  @ApiModelProperty(value = "错误信息描述")
  private String msg;

  @ApiModelProperty(value = "返回结果")
  private T result;
}
