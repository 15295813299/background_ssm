package com.fl.mapper;

import com.fl.dto.RoleInfoDto;
import com.fl.vo.RoleInfoVo;

import java.util.List;


public interface RoleInfoMapper {
    public List<RoleInfoDto> getRoleInfoById(Integer id);
    //删除中间表中所有userid=前端传过来的id的角色信息
    public Integer updateRoleStatusByIds(RoleInfoVo roleInfoVo);

    //添加所有分配的角色状态
    public Integer addUserRole(RoleInfoVo roleInfoVo);

    //删除所有状态为0的角色状态
    public Integer deleteRoleStatus();

    //获取所有
    public List<RoleInfoDto> getRoleAll();
}
