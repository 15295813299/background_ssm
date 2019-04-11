package com.fl.service;

import com.fl.dto.Account;
import com.fl.pojo.UserInfo;
import com.fl.vo.UserInfoVo;

import java.util.List;

public interface UserService {
    public List<UserInfo> getUserBy(UserInfo userInfo);
    public Integer insertUser(UserInfo userInfo);
    public Boolean updateUserInfoById(UserInfo userInfo);
    public UserInfo loginCheck(UserInfo userInfo);

    public Boolean deleteUser(UserInfo userInfo);
    //通过id批量删除
    public Boolean deleteUserAll(List list);

    //获取分页用户信息
    public List<UserInfo> getPageUserInfo(UserInfoVo userInfoVo);

    //获取userinfo表中总条数
    public Integer getUserInfoCount(UserInfoVo userInfoVo);

}
