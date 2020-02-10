package com.xinba.supermarket.dao;

import com.xinba.supermarket.controller.request.GoodsRequestParam;
import com.xinba.supermarket.entity.Goods;
import com.xinba.supermarket.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);

    int queryCount(GoodsRequestParam param);

    List<Goods> selectByParam(GoodsRequestParam param);
}