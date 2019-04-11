package com.fl.pojo;


import java.util.List;

public class Menuinfo {

  private Integer menuid;
  private String menuname;
  private String menupath;
  private String menuicon;
  private Integer parentid;

  private List<Menuinfo> sonTag;

  private List<UserRole> roleList;
  public Integer getMenuid() {
    return menuid;
  }

  public void setMenuid(Integer menuid) {
    this.menuid = menuid;
  }


  public String getMenuname() {
    return menuname;
  }

  public void setMenuname(String menuname) {
    this.menuname = menuname;
  }


  public String getMenupath() {
    return menupath;
  }

  public void setMenupath(String menupath) {
    this.menupath = menupath;
  }


  public String getMenuicon() {
    return menuicon;
  }

  public void setMenuicon(String menuicon) {
    this.menuicon = menuicon;
  }


  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }

  @Override
  public String toString() {
    return "Menuinfo{" +
            "menuid=" + menuid +
            ", menuname='" + menuname + '\'' +
            ", menupath='" + menupath + '\'' +
            ", menuicon='" + menuicon + '\'' +
            ", parentid=" + parentid +
            ", roleList=" + roleList +
            '}';
  }
}
