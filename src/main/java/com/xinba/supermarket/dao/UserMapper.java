package com.xinba.supermarket.dao;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.UserRequestParam;
import com.xinba.supermarket.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int queryCount(UserRequestParam param);

    List<User> selectByParam(UserRequestParam param);
}