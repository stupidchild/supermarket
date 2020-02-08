package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Keywords;

public interface KeywordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Keywords record);

    int insertSelective(Keywords record);

    Keywords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Keywords record);

    int updateByPrimaryKey(Keywords record);
}