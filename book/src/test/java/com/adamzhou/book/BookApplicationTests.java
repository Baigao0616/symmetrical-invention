package com.adamzhou.book;

import com.adamzhou.book.entity.Book;
import com.adamzhou.book.entity.Manager;
import com.adamzhou.book.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

@SpringBootTest
class BookApplicationTests {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BorrowBookMapper borrowBookMapper;
    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private ReaderMapper readerMapper;
    @Autowired
    private ReturnBookMapper returnBookMapper;

    @Test
    void contextLoads() {
//      List<Book> books = bookMapper.selectList(null);
//      books.forEach(System.out::println);
        List<Manager> managers = managerMapper.selectList(null);
        managers.forEach(System.out::println);
    }

    //测试插入
    @Test
    public void testInsert(){
        Book book = new Book();
        book.setBookName("天龙八部");
        book.setBookNumber("220522");
        book.setAuthor("金庸");
        book.setCategory("古典文学");
        book.setInventory(10);
        book.setPrice(BigDecimal.valueOf(14.34));
        book.setPublisher("国字号出版社");
        book.setBookTotal(20);
        int result = bookMapper.insert(book);
        System.out.println(result);
        System.out.println(book);
    }

    @Test
    public void InsertManager(){
        Manager manager = new Manager();
        manager.setManagerId("202201");
        manager.setName("白告同学");
        manager.setPassword("123456");
        manager.setTelephone("18906637555");
        int result = managerMapper.insert(manager);
        System.out.println(result);
        System.out.println(manager);
    }

    //测试更新
    @Test
    public void testUpdate(){
        Book book = new Book();
        book.setBookNumber("220522");
        book.setPublisher("我是卡莎出版社");
        int i = bookMapper.updateById(book);
        System.out.println(i);

    }

    //测试查询
    //单查询
    @Test
    public void testSelectById(){
        Book book = bookMapper.selectById("1001");
        System.out.println(book);
    }

    @Test
    public void ManagerTestSelectById(){
        Manager manager = managerMapper.selectById(202201);
        System.out.println(manager);
    }

    //多查询
    @Test
    public void testSelectByBatchId(){
        List<Book> books = bookMapper.selectBatchIds(Arrays.asList(1001, 1002, 1003));
        books.forEach(System.out::println);
    }

    //条件查询
    // map
    @Test
    public void testSelectByBatchIds(){
        HashMap<String,Object> map = new HashMap<>();
        //自定义查询
        map.put("category","计算机");
        List<Book> books = bookMapper.selectByMap(map);
        books.forEach(System.out::println);
    }

    //测试删除
    @Test
    public void testDeleteById(){
        bookMapper.deleteById("220522");
    }

    //批量删除
    @Test
    public void testDeleteByBatchId(){
        bookMapper.deleteBatchIds(Arrays.asList(220522,220523));
    }

    //通过map删除
    @Test
    public void testDeleteByMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("author","金庸");
        bookMapper.deleteByMap(map);
    }




}
