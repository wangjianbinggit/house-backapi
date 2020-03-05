package com.team.house.housebackapi.service;

import com.team.house.housebackapi.entity.District;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictService
 * @Description TODO
 * @Date 2020/2/25 16:36
 * @Created by Administrator
 */
public interface DistrictService {
    //查询所有的区域
    public List<District> getAllDistrict();
}
