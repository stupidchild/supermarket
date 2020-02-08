package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Coupon;

public interface CouponMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}