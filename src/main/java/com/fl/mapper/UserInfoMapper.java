package com.fl.mapper;

import com.fl.pojo.UserInfo;
import com.fl.vo.UserInfoVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserInfoMapper {

    //获取所有用户
    public List<UserInfo> getUserBy(UserInfo userInfo);

    //插入用户到数据库
    public Integer insertUser(UserInfo userInfo);

    //根据id修改用户
    public Integer updateUserInfoById(UserInfo userInfo);

    //验证账号密码
    public UserInfo loginCheck(UserInfo userInfo);

    //用户名获取用户信息
    public Integer getUserByUsername(String username);

    //删除用户
    public Integer deleteUser(Integer userId);

    //通过id批量删除
    public Integer deleteUserAll(List list);

    //获取分页用户信息
    public List<UserInfo> getPageUserInfo(UserInfoVo userInfoVo);

    //获取userinfo表中总条数
    public Integer getUserInfoCount(UserInfoVo userInfoVo);
}
