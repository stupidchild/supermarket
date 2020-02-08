package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKeyWithBLOBs(Cart record);

    int updateByPrimaryKey(Cart record);
}