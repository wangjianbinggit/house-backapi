package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.Users;

/**
 * @author 王建兵
 * @Classname DistrictService
 * @Description TODO
 * @Date 2020/2/25 16:36
 * @Created by Administrator
 */
public interface UserService {
    //注册业务
    public int regUser(Users users);
    //登入
    public Users Login(String username,String password);
}
