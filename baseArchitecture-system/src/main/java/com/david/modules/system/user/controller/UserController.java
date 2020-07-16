package com.david.modules.system.user.controller;

import java.util.Set;

import com.david.base.domain.PageDto;
import com.david.modules.system.user.controller.criteria.UserQueryCriteria;
import com.david.modules.system.user.controller.dto.UserDto;
import com.david.modules.system.user.controller.mapper.UserMapper;
import com.david.modules.system.user.domain.entity.User;
import com.david.modules.system.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 用户控制层
 * @author: lingjian
 * @create: 2020/7/14 9:59
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/sys/user")
@Api(tags = "系统：用户管理")
public class UserController {

  private final UserService service;
  private final UserMapper mapper;

  @PostMapping
  @ApiOperation("新增用户")
  public void create(@Validated @RequestBody User user) {
    service.create(user);
  }

  @PutMapping
  @ApiOperation("修改用户")
  public void update(@Validated(User.Update.class) @RequestBody User user) {
    service.update(user);
  }

  @DeleteMapping
  @ApiOperation("删除用户")
  public void delete(@RequestBody Set<Long> ids) {
    service.delete(ids);
  }

  @GetMapping(value = "/{id}")
  @ApiOperation("获取单个用户")
  public UserDto query(@PathVariable Long id) {
    return mapper.toDto(service.findById(id));
  }

  @GetMapping()
  @ApiOperation("分页查询用户")
  public PageDto<UserDto> query(UserQueryCriteria criteria) {
    return mapper.toDto(service.queryAll(criteria));
  }
}
