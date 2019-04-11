package com.fl.service.impl;

import com.fl.dto.Account;
import com.fl.mapper.UserInfoMapper;
import com.fl.pojo.UserInfo;
import com.fl.service.UserService;
import com.fl.vo.UserInfoVo;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserBy(UserInfo userInfo) {

        return userInfoMapper.getUserBy(userInfo);
    }

    public Integer insertUser(UserInfo userInfo) {
        Integer count = userInfoMapper.getUserByUsername(userInfo.getUsername());
        if (count>0) {
            return 0;
        }
        Integer integer = userInfoMapper.insertUser(userInfo);
        if (integer>0) {
            return 1;
        }
        return 2;
    }

    public Boolean updateUserInfoById(UserInfo userInfo) {
        Integer integer = userInfoMapper.updateUserInfoById(userInfo);
        if (integer>0) {
            return true;
        }
        return false;
    }

    public UserInfo loginCheck(UserInfo userInfo){
        UserInfo info = userInfoMapper.loginCheck(userInfo);
        if (info!=null) {
            if (info.getPassword().equals(userInfo.getPassword())) {
                info.setPassword(null);
                return info;
            }
        }
        return null;
    }

    public Boolean deleteUser(UserInfo userInfo) {
        Integer integer = userInfoMapper.deleteUser(userInfo.getUserid());
        if (integer>0) {
            return true;
        }
        return false;
    }

    public Boolean deleteUserAll(List list) {
        Integer integer = userInfoMapper.deleteUserAll(list);
        if (integer>0){
            return true;
        }
        return false;
    }

    public List<UserInfo> getPageUserInfo(UserInfoVo userInfoVo) {
        List<UserInfo> list = userInfoMapper.getPageUserInfo(userInfoVo);
        return list;
    }

    public Integer getUserInfoCount(UserInfoVo userInfoVo) {
        return userInfoMapper.getUserInfoCount(userInfoVo);
    }
}
