package com.fl.controller;

import com.fl.dto.Account;
import com.fl.dto.UserInfoDto;
import com.fl.mapper.UserInfoMapper;
import com.fl.pojo.UserInfo;
import com.fl.service.UserService;
import com.fl.service.impl.UserServiceImpl;
import com.fl.utils.ArrayToList;
import com.fl.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;


/**
 * 登录注册
 */
@Controller
public class LoginController {

    @Autowired
    UserServiceImpl userService;

    /**
     * 登录验证
     * @param userInfo
     * @return 成功则true或失败false
     */
    @ResponseBody
    @RequestMapping(value = "loginCheck",method = {RequestMethod.POST})
    public Object loginCheck(@RequestBody UserInfo userInfo, HttpSession httpSession){
        UserInfo info = userService.loginCheck(userInfo);
        System.out.println(info);
        if (info!=null) {
            httpSession.removeAttribute("userinfo");
            httpSession.setAttribute("userinfo",info);
        }
        return info;
    }

    /**
     * 注册用户
     * @param userInfo
     * @return 用户名已存在则返回0，注册失败则2,注册成功则1
     */
    @ResponseBody
    @RequestMapping(value = "registerUser",method = {RequestMethod.POST})
    public String registerUser(@RequestBody UserInfo userInfo){
        Integer integer = userService.insertUser(userInfo);
        return integer.toString();
    }

    @ResponseBody
    @RequestMapping(value = "getUserBy",method = RequestMethod.POST)
    public Object getUserBy(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> userAll = userService.getUserBy(userInfo);
        return userAll;
    }

    @ResponseBody
    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    public String updateUserInfoById(@RequestBody UserInfo userInfo){
        Boolean flag = userService.updateUserInfoById(userInfo);
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    public String deleteUser(@RequestBody UserInfo userInfo){
        Boolean flag = userService.deleteUser(userInfo);
        System.out.println(userInfo);

        return flag.toString();
    }


    @ResponseBody
    @RequestMapping(value = "deleteUserAll",method = RequestMethod.POST)
    public String deleteUserAll(@RequestParam String[] ids){
        //System.out.println(Arrays.toString(ids));
        List<Integer> list = ArrayToList.arrayToList(ids);

        Boolean flag = userService.deleteUserAll(list);

        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "getPageUserInfo",method = RequestMethod.POST)
    public Object getPageUserInfo(@RequestBody(required = false) UserInfoVo userInfoVo){
        System.out.println(userInfoVo);
        Integer count = userService.getUserInfoCount(userInfoVo);
        userInfoVo.getPagin().setCountSum(count);

        List<UserInfo> list = userService.getPageUserInfo(userInfoVo);
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setList(list);
        userInfoDto.setPagin(userInfoVo.getPagin());
        return userInfoDto;
    }
}
