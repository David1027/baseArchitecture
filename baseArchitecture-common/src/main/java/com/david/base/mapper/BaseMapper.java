package com.david.base.mapper;

import java.util.List;

import com.david.base.domain.PageDto;

import org.springframework.data.domain.Page;

/**
 * @description: 基础mapstruct接口
 * @author: lingjian
 * @create: 2020/7/13 15:46
 */
public interface BaseMapper<Dto, Entity> {

  /**
   * Entity 转 Dto
   *
   * @param entity 实体类
   * @return Dto
   */
  Dto toDto(Entity entity);

  /**
   * Dto 转 Entity
   *
   * @param dto Dto
   * @return Entity 实体类
   */
  Entity toEntity(Dto dto);

  /**
   * Entity 转 Dto集合
   *
   * @param entityList 实体类集合
   * @return List<Dto> DTO集合
   */
  List<Dto> toDto(List<Entity> entityList);

  /**
   * Dto 转 Entity集合
   *
   * @param dtoList Dto
   * @return List<Entity> 实体类集合
   */
  List<Entity> toEntity(List<Dto> dtoList);

  /**
   * Entity 转 Dto 分页集合
   *
   * @param page 实体类分页集合
   * @return PageDto<Dto> Dto分页集合
   */
  default PageDto<Dto> toDto(Page<Entity> page) {
    return new PageDto<>(page.getTotalElements(), toDto(page.getContent()));
  }
}
