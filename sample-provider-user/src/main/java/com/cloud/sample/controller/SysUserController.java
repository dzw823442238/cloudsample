package com.cloud.sample.controller;

import com.cloud.sample.model.SysUser;
import com.cloud.sample.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhiwei on 2018/4/3.
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/{id}")
    public SysUser getUser(@PathVariable Integer id, @RequestParam(required = false) String loginName){
        SysUser sysUser = sysUserService.selectSysUser(id);
        return sysUser;
    }

}
