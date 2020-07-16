package com.david.modules.system.user.controller.mapper;

import com.david.base.mapper.BaseMapper;
import com.david.modules.system.user.controller.dto.UserDto;
import com.david.modules.system.user.domain.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @description: 用户类转换接口
 * @author: lingjian
 * @create: 2020/7/14 10:10
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends BaseMapper<UserDto, User> {}
