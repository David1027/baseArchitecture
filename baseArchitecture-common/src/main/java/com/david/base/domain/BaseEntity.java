package com.david.base.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @description: 基础实体类
 * @author: lingjian
 * @create: 2020/7/13 15:11
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

  @Id
  @NotNull(groups = Update.class)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID", hidden = true)
  private Long id;

  @CreatedBy
  @Column(name = "create_by", updatable = false)
  @ApiModelProperty(value = "创建人", hidden = true)
  private String createBy;

  @LastModifiedBy
  @Column(name = "update_by")
  @ApiModelProperty(value = "更新人", hidden = true)
  private String updateBy;

  @CreationTimestamp
  @Column(name = "create_time", updatable = false)
  @ApiModelProperty(value = "创建时间", hidden = true)
  private Timestamp createTime;

  @UpdateTimestamp
  @Column(name = "update_time")
  @ApiModelProperty(value = "更新时间", hidden = true)
  private Timestamp updateTime;

  /** 创建时分组校验 */
  public @interface Create {}

  /** 更新时分组校验 */
  public @interface Update {}
}
