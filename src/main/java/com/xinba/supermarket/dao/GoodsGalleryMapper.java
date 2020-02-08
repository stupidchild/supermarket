package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.GoodsGallery;

public interface GoodsGalleryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsGallery record);

    int insertSelective(GoodsGallery record);

    GoodsGallery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsGallery record);

    int updateByPrimaryKey(GoodsGallery record);
}