package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.TopicCategory;

public interface TopicCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TopicCategory record);

    int insertSelective(TopicCategory record);

    TopicCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicCategory record);

    int updateByPrimaryKey(TopicCategory record);
}