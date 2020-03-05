package com.team.house.housebackapi.service.impl;

import com.team.house.housebackapi.entity.Type;
import com.team.house.housebackapi.entity.TypeExample;
import com.team.house.housebackapi.mapper.TypeMapper;
import com.team.house.housebackapi.service.StreetService;
import com.team.house.housebackapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictServiceImpl
 * @Description TODO
 * @Date 2020/2/25 16:37
 *@Created by Administrator
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired(required = false)
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAllType() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
