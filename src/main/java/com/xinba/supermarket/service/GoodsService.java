package com.xinba.supermarket.service;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.GoodsRequestParam;
import com.xinba.supermarket.entity.Goods;

public interface GoodsService {

    Goods queryById(int id);

    int save(Goods goods);

    Pagination<Goods> selectByPage(GoodsRequestParam param);
}
