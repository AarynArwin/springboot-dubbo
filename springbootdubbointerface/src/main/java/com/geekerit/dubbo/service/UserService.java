package com.geekerit.dubbo.service;

import com.geekerit.dubbo.domain.User;

/**
 * 用户接口类
 */
public interface UserService {
    /**
     * 用户打招呼
     * @param username 用户名
     */
    void sayHi(String username);

    /**
     * 通过用户名查询用户
     * @param username  用户名
     * @return          用户具体信息
     */
    User selectUserByName(String username);
}
