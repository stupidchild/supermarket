package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Region;

public interface RegionMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}