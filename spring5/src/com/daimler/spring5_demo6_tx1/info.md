## 事务操作
#### 1. 创建数据库表, 添加记录
#### 2. 创建service, 搭建dao, 完成对象创建和注入关系
    1. service注入dao, 在dao注入jdbcTemplate, 在jdbcTemplate注入DataSource
   
#### 3. 在dao创建两个方法: 多钱和少钱的方法, 在service创建方法(转账的方法)

## Spring事务管理介绍
#### 1. 事务添加到javaEE三层结构里面的service层(业务逻辑层)

#### 2. 在Spring进行事务管理操作:
    有两种方式: 编程式事务管理和声明式事务管理(使用)
    
#### 3. 声明式事务管理方式
    1. 基于注解方式(使用)
    2. 基于xml配置文件方式
    
#### 4. 在Spring进行声明式事务管理方式, 底层使用AOP

#### 5. Spring事务管理API
    1. 提供了一个接口, 代表事务管理器, 这个接口针对不同框架提供了不同的实现类
    
## 事务操作(注解声明式事务管理)
#### 1. 在Spring配置文件配置事务管理器

#### 2. 在Spring配置文件, 开启事务注解
    1. 在Spring配置文件引入名称空间tx
           xmlns:tx="http://www.springframework.org/schema/tx"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                               http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
                               http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">
    
    2.开启事务注解
           <tx:annotation-driven transaction-manager="transactionManager"></tx:annotation-driven>
    
    3. 在service类上面(或service类方法上面)添加事务注解
        3.1 @Transactional, 这个注解可以添加到类上, 也可以添加到方法上
        3.2 如果把这个注解添加到类上面, 这个类里面所有方法都加了事务
        3.3 如果添加到方法上, 只为当前方法添加了事务
    
## 事务操作(注解声明式事务管理参数配置)
#### 1. 在service类上面添加注解@Transactional, 在这个注解里面可以配置事务相关参数

#### 2. propagation: 事务传播行为
    1. 多事务方法直接调用, 这个过程事务是如何进行管理的
    
| 传播属性 | 描述 |
| ---- | ---- |
| REQUIRED | 如果有事务在运行, 当前方法就在该事务内运行, 否则, 就启动一个新的事务, 并在自己的事务内运行 |
|REQUIRED_NEW|当前的方法必须启动新事务, 并在自己的事务内运行, 如果有事务在运行, 应该将他挂起|
|SUPPORTS|如果有事务在运行, 当前方法就在该事务内运行,否则可以不运行在事务中|

        
#### 3. isolation: 事务隔离级别
s

#### 4. timeout: 超时

#### 5. readonly: 是否只读

#### 6. rollbackFor: 回滚

#### 7. noRollbackFor: 不回滚