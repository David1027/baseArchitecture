package com.david.modules.system.user.repository.repository;

import com.david.base.repository.BaseRepository;
import com.david.modules.system.user.domain.entity.User;
import com.david.modules.system.user.repository.dao.UserDao;

/**
 * @description: 用户JPA接口
 * @author: lingjian
 * @create: 2020/7/14 9:51
 */
public interface UserRepository extends UserDao, BaseRepository<User, Long> {}
