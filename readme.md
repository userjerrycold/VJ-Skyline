# VJ-Skyline 通用后台管理系统  
> 基于 Vue + Spring Boot 的企业级中台架构，开箱即用的权限管理与业务扩展平台  

## 技术栈  
| 层级       | 技术选型                |
|------------|-------------------------|
| 前端       | Vue 3 + Element Plus + TypeScript + Vite |
| 后端       | Java 8 + Spring Boot 2.2.2 + Spring Data JPA |
| 数据库     | MySQL 5.7（支持读写分离） |
| 缓存       | Redis（JWT令牌存储）     |
| 安全       | Spring Security + JWT   |
| 构建工具   | Maven 3.6 + Dockerfile  |

## 核心功能  
✅ RBAC权限模型（用户/角色/菜单/数据权限）  
✅ 动态路由与菜单管理（支持前端异步加载）  
✅ 系统监控（Druid + Spring Boot Admin）  
✅ 通用代码生成器（单表/树形结构CRUD）  
✅ 多数据源支持（Master-Slave模式）  

## 目录结构  
```bash
project-root/
├── skyline-api/          # 接口暴露模块（REST API）
├── skyline-service/      # 业务逻辑层（核心服务）
├── skyline-repository/   # 数据访问层（JPA Repository）
├── skyline-common/       # 公共组件（工具类/异常/常量）
├── skyline-config/       # 配置文件（application.yml等）
├── skyling-start/        # 启动模块（Spring Boot主类）
└── docs/                 # 文档（数据库设计/API文档）
