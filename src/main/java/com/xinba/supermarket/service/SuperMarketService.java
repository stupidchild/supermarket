package com.xinba.supermarket.service;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.SuperMarketRequestParam;
import com.xinba.supermarket.entity.Supermarket;

public interface SuperMarketService {

    Supermarket queryById(int id);

    int save(Supermarket supermarket);

    Pagination<Supermarket> selectByPage(SuperMarketRequestParam param);
}
