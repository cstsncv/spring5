## jdbcTemplate(概念和准备)
#### 1.什么是jdbcTemplate
(1) Spring框架对JDBC进行封装, 使用jdbcTemplate方便实现对数据库操作


#### 2. 准备工作
(1) 引入相关jar包

(2) 在Spring配置文件配置数据库连接池

(3) 配置jdbcTemplate对象, 注入DataSource

(4) 创建service类, 创建dao类, 在dao注入jdbcTemplate对象

## jdbcTemplate操作数据库
#### 1. 添加
    1. 对应数据库创建实体类
    2. 编写service和dao
        1. 在dao进行数据库添加操作
        2. 调用jdbcTemplate对象里面的update()方法实现添加操作
        update(String sql, Object... args)
        * 有两个参数
        * 第一个参数: sql语句
        * 第二个参数: 可变参数, 设置sql语句值
        
#### 2.修改,删除类似添加

#### 3. 测试类
    1. 创建对象
    2. service对象add()方法添加对象
    
## jdbcTemplate操作数据库--查询
### 查询返回某个值
#### 1. 查询表里面有多少条记录, 返回某个值
#### 2. queryForObject(String sql, Class<T> requiredType)
    有两个参数
    第一个参数: sql语句
    第二个参数: 返回类型的Class
### 查询返回对象
#### 1. 场景: 查询图书详情 
#### 2. jdbcTemplate实现返回查询对象
#### 3. queryForObject(String sql, RowMapper<T> rowMapper, Object...args) 
    有三个参数
    第一个: sql语句
    第二个: RowMapper是接口, 针对返回不同类型数据, 使用这个接口里面的实现类完成数据封装
    第三个: sql语句值
    
    
### 查询返回集合
#### 1. 场景: 查询图书列表分页...
#### 2. jdbcTemplate实现返回查询集合
#### 3. query(String sql, RowMapper<T> rowMapper, Object...args) 
    有三个参数
    第一个: sql语句
    第二个: RowMapper是接口, 针对返回不同类型数据, 使用这个接口里面的实现类完成数据封装
    第三个: sql语句值
    
## jdbcTemplate操作数据库--批量操作
#### 1. 批量操作: 操作表里面多条记录
#### 2. jdbcTemplate实现批量添加操作
##### batchUpdate(String sql, List<Object[]> batchArgs)
    有两个参数:
    第一个: sql语句
    第二个: List集合, 添加多条记录数据

#### 2. jdbcTemplate实现批量修改操作


