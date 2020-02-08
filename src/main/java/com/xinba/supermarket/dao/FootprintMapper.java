package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Footprint;

public interface FootprintMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Footprint record);

    int insertSelective(Footprint record);

    Footprint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Footprint record);

    int updateByPrimaryKey(Footprint record);
}