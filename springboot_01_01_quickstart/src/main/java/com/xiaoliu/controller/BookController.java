package com.xiaoliu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getBookById() {
        System.out.println("springboot is running");
        return "springboot is running";
    }
}
