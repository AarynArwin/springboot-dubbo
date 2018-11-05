package com.geekerit.springbootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.geekerit.dubbo.domain.User;
import com.geekerit.dubbo.service.UserService;
import com.geekerit.springbootdubboprovider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/5 16:35
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void sayHi(String username) {
        System.out.println("hi" + username);
    }

    @Override
    public User selectUserByName(String username) {
        User user = userMapper.selectUserByUsername(username);
        return user;
    }


}
