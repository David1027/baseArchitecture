package com.david.modules.system.user.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.david.base.domain.BaseEntity;
import com.david.modules.system.user.domain.enums.GenderEnum;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 用户 - 实体类
 * @author: lingjian
 * @create: 2020/7/14 9:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "sys_user")
public class User extends BaseEntity {

  @NotBlank
  @Column(name = "username", unique = true)
  @ApiModelProperty(value = "名称")
  private String username;

  @Column(name = "password")
  @ApiModelProperty(value = "密码")
  private String password;

  @NotBlank
  @Column(name = "nick_name")
  @ApiModelProperty(value = "昵称")
  private String nickName;

  @NotBlank
  @Column(name = "phone")
  @ApiModelProperty(value = "手机号码")
  private String phone;

  @Email
  @NotBlank
  @Column(name = "email")
  @ApiModelProperty(value = "邮箱")
  private String email;

  @Enumerated(EnumType.STRING)
  @Column(name = "gender")
  @ApiModelProperty(value = "性别")
  private GenderEnum gender;
}
