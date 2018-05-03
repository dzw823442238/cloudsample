package com.cloud.sample.service.impl;

import com.cloud.sample.dao.SysUserMapper;
import com.cloud.sample.model.SysUser;
import com.cloud.sample.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Apple on 2018/4/21.
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectSysUser(Integer id) {
        return sysUserMapper.selectSysUser(id);
    }
}
