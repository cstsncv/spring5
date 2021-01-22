package com.daimler.spring5_demo5_jdbctemp.test;

import com.daimler.spring5_demo5_jdbctemp.entity.Book;
import com.daimler.spring5_demo5_jdbctemp.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId("0");
        book.setUsername("王钢蛋");
        book.setUstatus("OK");
        bookService.add(book);

        // 添加
        book.setUserId("1");
        book.setUsername("Python");
        book.setUstatus("OK");
        bookService.update(book);

        // 删除
        bookService.delete("0");

        // 查询返回总行数
        int count = bookService.findCount();
        System.out.println("当前表行数: " + count);

        //查询返回单条对象
        Book bookInfo = bookService.findBookInfo("1");
        System.out.println(bookInfo);

        //查询返回所有对象
        List<Book> allBook = bookService.findAllBook();
        System.out.println(allBook);

        // 批量添加
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3", "Tom", "OK"};
        Object[] o2 = {"4", "Jerry", "NO"};
        Object[] o3 = {"5", "Tony", "NO"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);

        // 批量修改
        List<Object[]> batchArgs1 = new ArrayList<>();
        Object[] o11 = {"Tom12", "OK", "3"};
        Object[] o21 = {"Jerry21", "NO", "4"};
        Object[] o31 = {"Tony12", "NO", "5"};
        batchArgs1.add(o11);
        batchArgs1.add(o21);
        batchArgs1.add(o31);
        bookService.batchUpdate(batchArgs1);

        // 批量删除
        List<Object[]> batchArgs2 = new ArrayList<>();
        Object[] o12 = {"3"};
        Object[] o22 = {"4"};
        Object[] o32 = {"5"};
        batchArgs2.add(o12);
        batchArgs2.add(o22);
        batchArgs2.add(o32);
        bookService.batchDelete(batchArgs2);
    }
}
