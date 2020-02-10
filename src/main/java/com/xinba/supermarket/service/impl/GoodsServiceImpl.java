package com.xinba.supermarket.service.impl;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.GoodsRequestParam;
import com.xinba.supermarket.dao.GoodsMapper;
import com.xinba.supermarket.entity.Goods;
import com.xinba.supermarket.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("goodService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods queryById(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Goods goods) {
        if (goods.getId() == 0) {
            return goodsMapper.insert(goods);
        } else {
            return goodsMapper.updateByPrimaryKey(goods);
        }
    }

    @Override
    public Pagination<Goods> selectByPage(GoodsRequestParam param) {
        Pagination pagination = new Pagination();
        int count = goodsMapper.queryCount(param);
        if (count == 0) {
            return null;
        }
        pagination.setTotal(count);
        pagination.setData(goodsMapper.selectByParam(param));
        return pagination;
    }
}
