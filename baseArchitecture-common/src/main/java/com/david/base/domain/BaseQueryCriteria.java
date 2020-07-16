package com.david.base.domain;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 基础查询条件
 * @author: lingjian
 * @create: 2020/7/15 16:17
 */
@Data
public class BaseQueryCriteria implements Serializable {

  @ApiModelProperty(value = "分页-开始条目")
  private Integer start;

  @ApiModelProperty(value = "分页-显示条目")
  private Integer limit;
}
