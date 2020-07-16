# baseArchitecture

## 项目简介
  基础架构后端项目

## 项目技术选择
  - 基础框架  spring boot
  - 数据层框架  spring data jpa + querydsl
  - 接口文档  swagger2
  - POJO转换工具  mapstruct
  - 数据库连接池  druid
  - 数据库  mysql

## 项目结构

项目采用功能分模块开发

- `baseArchitecture-common`: 为系统的公共模块，各种工具类、公共配置等
- `baseArchitecture-system`: 为系统核心模块，也是项目入口模块，也是项目打包部署模块
