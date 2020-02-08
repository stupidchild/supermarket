package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.AdPosition;

public interface AdPositionMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(AdPosition record);

    int insertSelective(AdPosition record);

    AdPosition selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(AdPosition record);

    int updateByPrimaryKey(AdPosition record);
}