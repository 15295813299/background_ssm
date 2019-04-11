package com.fl.vo;

import com.fl.tool.Pagin;

public class UserInfoVo {
    private String username;
    private String email;
    private String name;

    Pagin pagin;

    public Pagin getPagin() {
        return pagin;
    }

    public void setPagin(Pagin pagin) {
        this.pagin = pagin;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", pagin=" + pagin +
                '}';
    }
}
