package com.fl.controller;

import com.fl.dto.MenuInfoDto;
import com.fl.service.MenuInfoService;
import com.fl.vo.MenuInfoVo;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuInfoController {
    @Autowired
    MenuInfoService service;

    @RequestMapping(value = "getMenuInfoAll",method = RequestMethod.POST)
    public List<MenuInfoDto> getMenuInfoAll(Integer id){
        System.out.println(id);
        List<MenuInfoDto> all = service.getMenuInfoAll(id);
        System.out.println(all);
        return all;
    }

    @RequestMapping(value = "getMenuInfoByUserId",method = RequestMethod.POST)
    List<MenuInfoDto> getMenuInfoByUserId(Integer id){
        List<MenuInfoDto> menuInfoByUserId = service.getMenuInfoByUserId(id);
        System.out.println(menuInfoByUserId);
        return menuInfoByUserId ;
    }

    @RequestMapping(value = "addMenuInfo",method = RequestMethod.POST)
    String addMenuInfo(@RequestBody MenuInfoVo menuInfoVo){
        System.out.println(menuInfoVo);
        Boolean menuinfo = service.updateMenuinfo(menuInfoVo);
        return menuinfo.toString();
    }

}
