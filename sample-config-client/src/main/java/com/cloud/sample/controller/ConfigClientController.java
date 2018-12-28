package com.cloud.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhiwei on 2018/5/10.
 */
@RestController
@RefreshScope
public class ConfigClientController {
    /**
     * 获取git仓库的profile属性
     */
    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello(){
        return  profile;
    }
}
