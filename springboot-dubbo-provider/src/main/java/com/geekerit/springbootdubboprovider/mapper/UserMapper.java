package com.geekerit.springbootdubboprovider.mapper;

import com.geekerit.dubbo.domain.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名查询用户详情
     * @param username  用户名
     * @return          用户详细信息
     */
    User selectUserByUsername(String username);
}