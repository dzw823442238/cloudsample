package com.cloud.sample.model;

/**
 * Created by Apple on 2018/4/21.
 */
public class SysUser {

    private Integer id;

    private String loginName;

    private String password;

    private String fristLogin;

    public SysUser() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFristLogin() {
        return fristLogin;
    }

    public void setFristLogin(String fristLogin) {
        this.fristLogin = fristLogin;
    }
}
