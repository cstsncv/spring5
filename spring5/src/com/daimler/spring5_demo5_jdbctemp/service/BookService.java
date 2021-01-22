package com.daimler.spring5_demo5_jdbctemp.service;

import com.daimler.spring5_demo5_jdbctemp.dao.BookDao;
import com.daimler.spring5_demo5_jdbctemp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加的方法
    public void add(Book book){
        bookDao.add(book);
    }

    // 修改的方法
    public void update(Book book){
        bookDao.update(book);
    }

    // 删除的方法
    public void delete(String id){
        bookDao.delete(id);
    }

    // 查询表记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    // 查询单一对象
    public Book findBookInfo(String id){
        return bookDao.findBookInfo(id);
    }

    // 查询返回集合
    public List<Book> findAllBook(){
        return bookDao.findAllBook();
    }

    // 批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);
    }

    // 批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }


    // 批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
