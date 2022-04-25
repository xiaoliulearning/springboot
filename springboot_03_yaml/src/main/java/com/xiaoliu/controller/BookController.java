package com.xiaoliu.controller;


import com.xiaoliu.entity.MyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private Environment env;
    @Autowired
    private MyDatasource myDatasource;
    @GetMapping
    public String getBookById() {
        System.out.println("springboot is running...2");
        System.out.println(env.getProperty("user.age"));
        System.out.println(env.getProperty("user.hoppy[1]"));
        System.out.println(myDatasource);
        return "springboot is running...2";
    }
}
