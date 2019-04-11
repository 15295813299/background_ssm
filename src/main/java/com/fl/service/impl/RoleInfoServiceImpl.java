package com.fl.service.impl;

import com.fl.dto.RoleInfoDto;
import com.fl.mapper.RoleInfoMapper;
import com.fl.service.RoleInfoService;
import com.fl.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    private RoleInfoMapper mapper;

    public List<RoleInfoDto> getRoleInfoById(Integer id) {
        return mapper.getRoleInfoById(id);
    }

    @Transactional
    public Boolean updateRoleStatusByIds(RoleInfoVo roleInfoVo){
        Integer r = mapper.updateRoleStatusByIds(roleInfoVo);
//        if (true) {
//            throw new RuntimeException("炸了");
//        }
        Integer integer = mapper.addUserRole(roleInfoVo);
        if (integer>0){
            mapper.deleteRoleStatus();
            return true;
        }
        return false;
    }

    public List<RoleInfoDto> getRoleAll() {
        return mapper.getRoleAll();
    }
}
