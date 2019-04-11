package com.fl.dto;

import java.util.List;

public class MenuInfoDto {
    private Integer id;
    private Integer pid;
    private Integer seqno;
    private String name;
    private String url;
    private String icon;
    private Integer open=1;
    private byte checked;
    private List<MenuInfoDto> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getOpen() {
        return open==(byte)1?true:false;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Boolean getChecked() {
        if (checked==(byte)1){
            return true;
        }
        return false;
    }
    public void setChecked(byte checked) {
        this.checked = checked;
    }

    public List<MenuInfoDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuInfoDto> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuInfoDto{" +
                "id=" + id +
                ", pid=" + pid +
                ", seqno=" + seqno +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", open=" + open +
                ", checked=" + checked +
                ", children=" + children +
                '}';
    }
}
