package com.fl.pojo;

import java.util.List;

public class UserRole {
    private Integer roleid;
    private String role;

    List<UserInfo> userInfoList;
    List<Menuinfo> menuinfoList;
    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleid=" + roleid +
                ", role='" + role + '\'' +
                ", userInfoList=" + userInfoList +
                ", menuinfoList=" + menuinfoList +
                '}';
    }
}
