package com.fl.service;

import com.fl.dto.RoleInfoDto;
import com.fl.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoService {
    //获取所有
    public List<RoleInfoDto> getRoleInfoById(Integer id);

    //删除所有id=传递过来的id的角色转态，以及添加所有分配的角色状态
    public Boolean updateRoleStatusByIds(RoleInfoVo roleInfoVo) throws RuntimeException;

    public List<RoleInfoDto> getRoleAll();

}
