package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Supermarket;

public interface SupermarketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supermarket record);

    int insertSelective(Supermarket record);

    Supermarket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Supermarket record);

    int updateByPrimaryKey(Supermarket record);
}