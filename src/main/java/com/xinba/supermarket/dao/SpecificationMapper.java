package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Specification;

public interface SpecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);
}