package com.geekerit.dubbo.domain;

/**
 * 用户实体
 */
public class User {

    private Long id;                // 用户主键

    private String username;        // 用户名

    private String password;        // 密码

    private int age;                // 年龄

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
