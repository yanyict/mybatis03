package com.sc.dao;

import java.util.List;
import java.util.Map;

import com.sc.po.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);
    //查询所有用户
    List<User> selectAllUser();
    
    //查询所有用户
    List<User> selectAllUserByType();
    
    List<User> selectUserByParam(User record);
    
    Map<String,Object> selectByProtites(User usr);
}