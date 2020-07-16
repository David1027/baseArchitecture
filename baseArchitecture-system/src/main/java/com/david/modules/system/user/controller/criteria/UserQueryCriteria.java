package com.david.modules.system.user.controller.criteria;

import com.david.base.domain.BaseQueryCriteria;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 用户查询条件
 * @author: lingjian
 * @create: 2020/7/15 16:05
 */
@Data
public class UserQueryCriteria extends BaseQueryCriteria {

  @ApiModelProperty(value = "名称")
  private String username;
}
