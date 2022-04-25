package com.xiaoliu.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "datasource")
public class MyDatasource {
    private String url;
    private String name;
    private String password;
    private String driver;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "MyDatasource{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }
}