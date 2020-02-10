package com.xinba.supermarket.dao;

import com.xinba.supermarket.controller.request.ProductRequestParam;
import com.xinba.supermarket.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int queryCount(ProductRequestParam param);

    List<Product> selectByParam(ProductRequestParam param);
}