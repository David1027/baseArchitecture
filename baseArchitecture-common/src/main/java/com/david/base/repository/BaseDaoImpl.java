package com.david.base.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 初始化QueryDSL的基础类
 * @author: lingjian
 * @create: 2020/7/13 16:54
 */
public abstract class BaseDaoImpl {

  @Autowired protected EntityManager entityManager;
  protected JPAQueryFactory queryFactory;

  @PostConstruct
  public void init() {
    queryFactory = new JPAQueryFactory(entityManager);
  }
}
