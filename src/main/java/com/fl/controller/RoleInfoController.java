package com.fl.controller;

import com.fl.dto.RoleInfoDto;
import com.fl.service.RoleInfoService;
import com.fl.vo.RoleInfoVo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService service;

    @RequestMapping(value = "getRoleInfoById" ,method = RequestMethod.POST)
    public List getRoleInfoById(@RequestParam Integer id){
        return service.getRoleInfoById(id);
    }

    @RequestMapping(value = "getRoleIdsByIds",method = RequestMethod.POST)
    public Boolean getRoleIdsByIds(@RequestBody RoleInfoVo roleInfoVo){
        System.out.println(roleInfoVo);
//        List<Integer> integers = Arrays.asList(roleInfoVo.getYesId());

        return service.updateRoleStatusByIds(roleInfoVo);
    }

    @RequestMapping(value = "getRoleAll",method = RequestMethod.POST)
    public Object getRoleAll(){
        List<RoleInfoDto> roleAll = service.getRoleAll();

        return roleAll;
    }

}
