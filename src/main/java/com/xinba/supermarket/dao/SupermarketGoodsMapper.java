package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.SupermarketGoods;

public interface SupermarketGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SupermarketGoods record);

    int insertSelective(SupermarketGoods record);

    SupermarketGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupermarketGoods record);

    int updateByPrimaryKeyWithBLOBs(SupermarketGoods record);

    int updateByPrimaryKey(SupermarketGoods record);
}