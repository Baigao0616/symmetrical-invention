package com.adamzhou.book;

import com.adamzhou.book.entity.*;
import com.adamzhou.book.mapper.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@MapperScan("com.adamzhou.book.mapper") //扫描mapper文件夹
@SpringBootApplication
public class BookApplication {
    @Autowired
    private BookMapper bookMapper;

    private static BorrowBookMapper borrowBookMapper;

    private static ManagerMapper managerMapper;

    private static ReaderMapper readerMapper;

    private static ReturnBookMapper returnBookMapper;

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);

        //开始登录
        String userID="";
        String password="";
        boolean loginResult=false;

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------欢迎使用书籍管理系统---------------");
        System.out.print("请输入管理员账号：");
        userID = sc.next();
        System.out.println(userID);
        Manager manager = new Manager();
                manager = managerMapper.selectById(202201);
        System.out.println(manager);
        System.out.print("请输入管理员密码：");
        password = sc.next();
        if(manager.getPassword().equals(password))
            System.out.println("--------------登录成功！--------------");


    }

}
