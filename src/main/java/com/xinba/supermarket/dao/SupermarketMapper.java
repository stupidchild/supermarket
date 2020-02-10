package com.xinba.supermarket.dao;

import com.xinba.supermarket.controller.request.SuperMarketRequestParam;
import com.xinba.supermarket.entity.Supermarket;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupermarketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Supermarket record);

    int insertSelective(Supermarket record);

    Supermarket selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Supermarket record);

    int updateByPrimaryKey(Supermarket record);

    int queryCount(SuperMarketRequestParam param);

    List<Supermarket> selectByParam(SuperMarketRequestParam param);
}