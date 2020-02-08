package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.UserLevel;

public interface UserLevelMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(UserLevel record);

    int insertSelective(UserLevel record);

    UserLevel selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(UserLevel record);

    int updateByPrimaryKey(UserLevel record);
}