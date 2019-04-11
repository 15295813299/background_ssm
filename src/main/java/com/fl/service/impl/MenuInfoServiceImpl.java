package com.fl.service.impl;

import com.fl.dto.MenuInfoDto;
import com.fl.mapper.MenuInfoMapper;
import com.fl.service.MenuInfoService;
import com.fl.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {
    @Autowired
    MenuInfoMapper menuInfoMapper;
    public List<MenuInfoDto> getMenuInfoAll(Integer integer) {
        return menuInfoMapper.getMenuInfoAll(integer);
    }

    public List<MenuInfoDto> getMenuInfoByUserId(Integer id) {
        return menuInfoMapper.getMenuInfoByUserId(id);
    }

    //更新用户权限
    @Transactional
    public Boolean updateMenuinfo(MenuInfoVo menuInfoVo){
        Integer integer = menuInfoMapper.deleteMenuInfoById(menuInfoVo);

        System.out.println("删除行数："+integer);
        if (menuInfoVo!=null){
            Integer info = menuInfoMapper.addMenuInfo(menuInfoVo);
            System.out.println("修改行数:"+info);
        }

        return true;
    }
}
