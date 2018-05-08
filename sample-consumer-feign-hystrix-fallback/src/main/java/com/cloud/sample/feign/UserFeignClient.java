package com.cloud.sample.feign;

import com.cloud.sample.model.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Apple on 2018/4/30.
 */
@FeignClient(name = "sample-provider-user",fallback = FeignClientFallback.class)
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    public SysUser findById(@RequestParam("id") Integer id, @RequestParam("loginName") String loginName);

}

@Component
class FeignClientFallback implements  UserFeignClient{

    @Override
    public SysUser findById(@RequestParam("id") Integer id, @RequestParam("loginName") String loginName) {
        SysUser sysUser = new SysUser();
        sysUser.setId(1);
        sysUser.setLoginName("默认用户");
        return sysUser;
    }
}