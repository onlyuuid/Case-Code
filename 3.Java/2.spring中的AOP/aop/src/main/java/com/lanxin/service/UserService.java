package com.lanxin.service;

/**
 * @author: WuPeng
 * @description: 用户服务
 * @date: 2024/6/11 15:45
 */

public interface UserService {

    /**
     * 用户登录接口
     * @param username 用户账号
     * @param password 用户密码
     */
    public void login(String username, String password, String ip);

    public void login2(String username, String password, String ip);

    public void getInfo();
}
