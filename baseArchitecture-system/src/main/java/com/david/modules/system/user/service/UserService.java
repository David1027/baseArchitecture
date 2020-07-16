package com.david.modules.system.user.service;

import java.util.Set;

import com.david.modules.system.user.controller.criteria.UserQueryCriteria;
import com.david.modules.system.user.domain.entity.User;

import org.springframework.data.domain.Page;

/**
 * @description: 用户服务层接口
 * @author: lingjian
 * @create: 2020/7/14 9:58
 */
public interface UserService {
  /**
   * 新增用户
   *
   * @param user 用户
   */
  void create(User user);

  /**
   * 修改用户
   *
   * @param user 用户
   */
  void update(User user);

  /**
   * 删除用户
   *
   * @param ids 用户集合
   */
  void delete(Set<Long> ids);

  /**
   * 根据ID查询单个用户
   *
   * @param id ID
   * @return User 用户
   */
  User findById(Long id);

  /**
   * 根据条件分页查询全部用户
   *
   * @param criteria 条件
   * @return Page<User> 用户分页集合
   */
  Page<User> queryAll(UserQueryCriteria criteria);
}
