package com.cloud.sample.feign;

import com.cloud.sample.model.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Apple on 2018/4/30.
 */
@FeignClient(name = "sample-provider-user")
public interface UserFeignClient {
    @GetMapping("/{id}")
    public SysUser findById(@PathVariable(name = "id") Integer id);

}