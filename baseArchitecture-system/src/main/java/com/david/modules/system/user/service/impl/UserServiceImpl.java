package com.david.modules.system.user.service.impl;

import java.util.Set;

import com.david.modules.system.user.controller.criteria.UserQueryCriteria;
import com.david.modules.system.user.domain.entity.User;
import com.david.modules.system.user.repository.repository.UserRepository;
import com.david.modules.system.user.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: 用户服务层接口实现类
 * @author: lingjian
 * @create: 2020/7/14 9:58
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository repository;

  /**
   * 新增用户
   *
   * @param user 用户
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public void create(User user) {
    repository.save(user);
  }

  /**
   * 修改用户
   *
   * @param user 用户
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public void update(User user) {
    // 根据id获取用户对象
    User result = repository.findById(user.getId()).orElseGet(User::new);
    // 修改用户属性
    result.setUsername(user.getUsername());
    result.setPassword(user.getPassword());
    result.setNickName(user.getNickName());
    result.setPhone(user.getPhone());
    result.setEmail(user.getEmail());
    result.setGender(user.getGender());
    // 保存对象
    repository.save(result);
  }

  /**
   * 删除用户
   *
   * @param ids 用户集合
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public void delete(Set<Long> ids) {
    for (Long id : ids) {
      repository.deleteById(id);
    }
  }

  /**
   * 根据ID查询单个用户
   *
   * @param id ID
   * @return User 用户
   */
  @Override
  public User findById(Long id) {
    return repository.findById(id).orElseGet(User::new);
  }

  /**
   * 根据条件分页查询全部用户
   *
   * @param criteria 条件
   * @return Page<User> 用户分页集合
   */
  @Override
  public Page<User> queryAll(UserQueryCriteria criteria) {
    return repository.queryAll(criteria, PageRequest.of(criteria.getStart(), criteria.getLimit()));
  }
}
