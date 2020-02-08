package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.Feedback;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Integer msgId);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Integer msgId);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKeyWithBLOBs(Feedback record);

    int updateByPrimaryKey(Feedback record);
}