# 重构基础：Java版

## 练习描述

### 练习1

    使用防卫语句取代条件表达式（Replaced the Nexted Conditional with Guard Clauses）重构遗留代码

### 练习2

    使用提炼函数(Extract Method)手法重构遗留代码

### 练习3

    使用抽象方法对象(Extract Method Object)重构遗留代码

## 环境要求
+ java 8
+ git

## 如何开始

首先初次下载完需要安装依赖和建立项目相关配置：

```
  Mac/Linux: ./gradlew idea
  Whindows:  gradlew.bat idea
```

```
  Mac/Linux: ./gradlew clean build
  Whindows:  gradlew.bat clean build
```

然后才能执行测试：

```
  Mac/Linux: ./gradlew clean test
  Whindows:  gradlew.bat clean test.
```

## 输出规范
+ 不得修改测试(除非必要情况)
+ 在/src/main下源代码上重构，重构后的代码必须通过测试 
