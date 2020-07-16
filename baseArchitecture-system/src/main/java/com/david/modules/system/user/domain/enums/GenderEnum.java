package com.david.modules.system.user.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 性别枚举
 * @author: lingjian
 * @create: 2020/7/14 9:45
 */
@Getter
@AllArgsConstructor
public enum GenderEnum {
  /** 性别：男, 女, 未知 */
  MAN("男"),
  WOMAN("女"),
  UNKNOWN("未知");

  private String description;
}
