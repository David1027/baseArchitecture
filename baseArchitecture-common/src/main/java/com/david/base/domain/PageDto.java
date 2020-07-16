package com.david.base.domain;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 分页对象
 * @author: lingjian
 * @create: 2020/7/13 16:10
 */
@Data
@AllArgsConstructor
public class PageDto<T> {

  @ApiModelProperty(value = "总条目数")
  private Long total;

  @ApiModelProperty(value = "集合对象")
  private List<T> items;
}
