package com.cloud.sample.controller;

import com.cloud.sample.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Apple on 2018/4/22.
 */
@RestController
public class SysUserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public SysUser findById(@PathVariable Integer id){
        return this.restTemplate.getForObject("http://localhost:8092/user/"+id,SysUser.class);
    }

}
