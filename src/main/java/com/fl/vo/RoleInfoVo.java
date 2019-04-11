package com.fl.vo;


import java.util.List;

public class RoleInfoVo {
    Integer userid;
    List<Integer> yesId;
    List<Integer> noId;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public List<Integer> getYesId() {
        return yesId;
    }

    public void setYesId(List<Integer> yesId) {
        this.yesId = yesId;
    }

    public List<Integer> getNoId() {
        return noId;
    }

    public void setNoId(List<Integer> noId) {
        this.noId = noId;
    }

    @Override
    public String toString() {
        return "RoleInfoVo{" +
                "userid=" + userid +
                ", yesId=" + yesId +
                ", noId=" + noId +
                '}';
    }
}
