package com.xiaoliu.springboot_01_02_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//rest模式
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getBookById() {
        System.out.println("springboot is running...3");
        return "springboot is running...3";
    }
}
