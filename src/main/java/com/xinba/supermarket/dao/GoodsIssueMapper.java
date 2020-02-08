package com.xinba.supermarket.dao;

import com.xinba.supermarket.entity.GoodsIssue;

public interface GoodsIssueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsIssue record);

    int insertSelective(GoodsIssue record);

    GoodsIssue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsIssue record);

    int updateByPrimaryKeyWithBLOBs(GoodsIssue record);

    int updateByPrimaryKey(GoodsIssue record);
}