package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.RelatedGoods;

public interface RelatedGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelatedGoods record);

    int insertSelective(RelatedGoods record);

    RelatedGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelatedGoods record);

    int updateByPrimaryKey(RelatedGoods record);
}