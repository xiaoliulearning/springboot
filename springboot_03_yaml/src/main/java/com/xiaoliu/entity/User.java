package com.xiaoliu.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }
    @Value("${country}")
    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    @Value("${user.age}")
    public void setAge(String age) {
        System.out.println(age);
        this.age = age;
    }
}
