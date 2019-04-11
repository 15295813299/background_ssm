package com.fl.service;

import com.fl.dto.MenuInfoDto;
import com.fl.vo.MenuInfoVo;

import java.util.List;

public interface MenuInfoService {
    List<MenuInfoDto> getMenuInfoAll(Integer integer);
    List<MenuInfoDto> getMenuInfoByUserId(Integer integer);
    public Boolean updateMenuinfo(MenuInfoVo menuInfoVo);
}
