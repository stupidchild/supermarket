package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Shipper;

public interface ShipperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipper record);

    int insertSelective(Shipper record);

    Shipper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipper record);

    int updateByPrimaryKey(Shipper record);
}