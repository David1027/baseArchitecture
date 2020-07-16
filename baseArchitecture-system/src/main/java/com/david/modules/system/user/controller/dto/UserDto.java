package com.david.modules.system.user.controller.dto;

import com.david.base.domain.BaseDto;
import com.david.modules.system.user.domain.enums.GenderEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 用户Dto
 * @author: lingjian
 * @create: 2020/7/14 10:07
 */
@Data
@ApiModel("用户Dto")
public class UserDto extends BaseDto {

  @ApiModelProperty(value = "名称")
  private String username;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "昵称")
  private String nickName;

  @ApiModelProperty(value = "手机号码")
  private String phone;

  @ApiModelProperty(value = "邮箱")
  private String email;

  @ApiModelProperty(value = "性别")
  private GenderEnum gender;
}
