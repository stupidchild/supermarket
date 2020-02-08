package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.CommentPicture;

public interface CommentPictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentPicture record);

    int insertSelective(CommentPicture record);

    CommentPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommentPicture record);

    int updateByPrimaryKey(CommentPicture record);
}