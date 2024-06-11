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
     * @return 登录结果
     */
    public int login(String username, String password, String ip);
}
