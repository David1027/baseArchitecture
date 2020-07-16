package com.david.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @description: 基础JPA接口
 * @author: lingjian
 * @create: 2020/7/13 16:50
 */
@NoRepositoryBean
public interface BaseRepository<T, TD>
    extends JpaRepository<T, TD>, JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, TD> {}
