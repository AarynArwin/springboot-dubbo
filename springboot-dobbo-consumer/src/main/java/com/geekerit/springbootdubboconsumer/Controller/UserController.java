package com.geekerit.springbootdubboconsumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.geekerit.dubbo.domain.User;
import com.geekerit.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/6 15:52
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Reference(version = "1.0",timeout = 1000)
    private UserService userService;

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public User getUserByUsername(@RequestParam(value = "username") String username){
        User user = userService.selectUserByName(username);

        return user;
    }
}
