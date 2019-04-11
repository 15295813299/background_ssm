package com.fl.mapper;

import com.fl.dto.MenuInfoDto;
import com.fl.vo.MenuInfoVo;

import java.util.List;

public interface MenuInfoMapper {
    //roleid获取所有菜单
    List<MenuInfoDto> getMenuInfoAll(Integer integer);

    //用户id获取菜单信息
    List<MenuInfoDto> getMenuInfoByUserId(Integer integer);

    //批量插入
    Integer addMenuInfo(MenuInfoVo menuInfoVo);

    //批量删除
    Integer deleteMenuInfoById(MenuInfoVo menuInfoVo);
}
