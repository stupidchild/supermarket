package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Topic;

public interface TopicMapper {
    int insert(Topic record);

    int insertSelective(Topic record);
}