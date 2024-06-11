package com.lanxin.service.impl;

import com.lanxin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: WuPeng
 * @description: 用户服务实现
 * @date: 2024/6/11 15:48
 */
@Service
public class UserServiceImpl implements UserService {

    // 场景描述: 下面是一个登录方法, 现在有一个需求是, 在执行登录操作前先查询登录日志, 检查ip是否合法,
    //          如果合法, 在登录后将其写入日志
    @Override
    public void login(String username, String password,String ip) {
        // 1. 查询登录日志
        {
            // 逻辑代码01
        }
        // 2. 校验账号密码及ip
        {
            // 逻辑代码01
        }
        // 3. 执行是否将ip写入日志
        {
            // 逻辑代码01
        }
    }

    /**
     * 如上所示: 上述的登录方法中会包含操作日志的代码, 可是操作日志与我们登录并不相关, 也就是说, 我们的登录方法里应该就是
     *          进行账号密码和ip的校验, 结果正确则登录成功, 反之则登录失败, 但是上述的方法中明显包含了与本功能不相干的代码
     *          增加了代码的耦合度, 不利于后期项目的维护
     */

    /**
     * AOP: AOP翻译为"面相切面编程"，可以将方法中与业务代码不相关的代码从中抽离出来, 从而降低代码的耦合度, 提升项目的可维护性
     */

    @Override
    public void login2(String username, String password,String ip) {
        System.out.println("当前账号:"+username + " 当前密码:"+password + " 当前ip: " + ip + " 校验账号密码......");
    }

    @Override
    public void getInfo() {
        System.out.println("获取信息...");
    }
}
