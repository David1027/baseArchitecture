package com.david.modules.system.user.repository.dao;

import com.david.modules.system.user.controller.criteria.UserQueryCriteria;
import com.david.modules.system.user.domain.entity.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @description: 用户数据访问自定义接口
 * @author: lingjian
 * @create: 2020/7/14 9:53
 */
public interface UserDao {

  /**
   * 根据条件分页查询全部用户
   *
   * @param criteria 条件
   * @param page 分页
   * @return Page<User> 用户分页集合
   */
  Page<User> queryAll(UserQueryCriteria criteria, Pageable page);
}
