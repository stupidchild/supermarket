package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.GoodsSpecification;

public interface GoodsSpecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpecification record);

    int insertSelective(GoodsSpecification record);

    GoodsSpecification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsSpecification record);

    int updateByPrimaryKey(GoodsSpecification record);
}