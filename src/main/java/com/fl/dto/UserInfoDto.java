package com.fl.dto;

import com.fl.pojo.UserInfo;
import com.fl.tool.Pagin;

import java.util.List;

public class UserInfoDto {

    private List<UserInfo> list;
    private Pagin pagin;

    public List<UserInfo> getList() {
        return list;
    }

    public void setList(List<UserInfo> list) {
        this.list = list;
    }

    public Pagin getPagin() {
        return pagin;
    }

    public void setPagin(Pagin pagin) {
        this.pagin = pagin;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "list=" + list +
                ", pagin=" + pagin +
                '}';
    }
}
