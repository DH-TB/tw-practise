# Spring Data JPA

## 练习描述
- 学习如何在已有的 `Spring Boot` 项目基础上，添加 `Spring Data JPA` 完成对数据库的各种操作
- 学习使用 `Spring Data JPA` 来操作实体对象，执行对MySQL的 `CRUD (增删改查)` 操作
- 学习使用 `Flyway` 对数据库做版本控制

## 环境要求
- java8
- spring-boot
- Intellij-IDEA
- MySQL

## 如何开始
- 在命令行中使用以下命令在用户本地任意目录下clone此题目库
- 本地启动 `MySQL Service` 
- 搭建数据库`employee_db`
- 在`build.gradle`中添加 `Spring Data JPA` 以及 `Flyway Core` 等依赖
- 并将数据库的 `url username password` 配置到项目中
- 执行 `./gradlew test` ，此时测试都是失败的
- 开始按照题目要求创建`entity`，完成实现和测试

## 输出规范
- 仔细阅读 `src/test/java/EmployeeJPATest` 中的需求描述，并在 `src/main/java/repository` 中将实现补全 
- 执行 `./gradlew test`，出现`BUILD SUCCESS`，即完成题目
