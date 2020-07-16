package com.david.modules.system.user.repository.dao.impl;

import com.david.base.repository.BaseDaoImpl;
import com.david.modules.system.user.controller.criteria.UserQueryCriteria;
import com.david.modules.system.user.domain.entity.QUser;
import com.david.modules.system.user.domain.entity.User;
import com.david.modules.system.user.repository.dao.UserDao;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * @description: 用户数据访问自定义接口实现类
 * @author: lingjian
 * @create: 2020/7/14 9:54
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

  QUser qUser = QUser.user;

  /**
   * 根据条件分页查询全部用户
   *
   * @param criteria 条件
   * @param page 分页
   * @return Page<User> 用户分页集合
   */
  @Override
  public Page<User> queryAll(UserQueryCriteria criteria, Pageable page) {
    // 查询
    JPAQuery<User> query = queryFactory.selectFrom(qUser);
    // 分页
    query.offset(page.getOffset()).limit(page.getPageSize());
    // 返回结果
    QueryResults<User> results = query.fetchResults();
    return new PageImpl<>(results.getResults(), page, results.getTotal());
  }
}
