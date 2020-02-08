package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Ad;

public interface AdMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Ad record);

    int insertSelective(Ad record);

    Ad selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKeyWithBLOBs(Ad record);

    int updateByPrimaryKey(Ad record);
}