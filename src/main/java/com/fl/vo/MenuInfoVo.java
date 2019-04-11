package com.fl.vo;

import java.util.List;

public class MenuInfoVo {
    private Integer id;
    private List<Integer> menuIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "MenuInfoVo{" +
                "id=" + id +
                ", menuIds=" + menuIds +
                '}';
    }
}
