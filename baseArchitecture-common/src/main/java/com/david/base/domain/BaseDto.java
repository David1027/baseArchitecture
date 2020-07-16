package com.david.base.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 基础DTO类
 * @author: lingjian
 * @create: 2020/7/13 15:42
 */
@Data
public class BaseDto implements Serializable {

  @ApiModelProperty(value = "ID")
  private Long id;

  @ApiModelProperty(value = "创建人")
  private String createBy;

  @ApiModelProperty(value = "更新人")
  private String updateBy;

  @ApiModelProperty(value = "创建时间")
  private Timestamp createTime;

  @ApiModelProperty(value = "更新时间")
  private Timestamp updateTime;
}
