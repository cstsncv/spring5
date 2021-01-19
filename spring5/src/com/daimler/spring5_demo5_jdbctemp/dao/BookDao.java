package com.daimler.spring5_demo5_jdbctemp.dao;

import com.daimler.spring5_demo5_jdbctemp.entity.Book;

import java.util.List;

public interface BookDao {
    //添加的方法
    void add(Book book);

    void update(Book book);

    void delete(String id);

    // 查询当前表行数
    int selectCount();

    // 查询返回单一对象信息
    Book findBookInfo(String id);

    // 查询返回集合
    List<Book> findAllBook();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
