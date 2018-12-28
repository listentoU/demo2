package com.javasm.demo2.user;

public class UserModel {

    private String username;
    private String password;
    private int age;
    //alt+insert

    public UserModel() {
    }

    public UserModel(String username, int age) {
        this.username = username;
        this.age = age;
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
