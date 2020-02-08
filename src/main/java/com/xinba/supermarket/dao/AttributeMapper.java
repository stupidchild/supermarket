package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Attribute;

public interface AttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    Attribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKeyWithBLOBs(Attribute record);

    int updateByPrimaryKey(Attribute record);
}