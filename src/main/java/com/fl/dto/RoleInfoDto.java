package com.fl.dto;

public class RoleInfoDto {
    private Integer roleId;

    private String role;

    private Integer userId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RoleInfoDto{" +
                "roleId=" + roleId +
                ", role='" + role + '\'' +
                ", userId=" + userId +
                '}';
    }
}
