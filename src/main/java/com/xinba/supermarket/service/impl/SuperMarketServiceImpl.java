package com.xinba.supermarket.service.impl;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.SuperMarketRequestParam;
import com.xinba.supermarket.dao.SupermarketMapper;
import com.xinba.supermarket.entity.Supermarket;
import com.xinba.supermarket.service.SuperMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("superMarketService")
public class SuperMarketServiceImpl implements SuperMarketService {

    @Autowired
    private SupermarketMapper supermarketMapper;

    @Override
    public Supermarket queryById(int id) {
        return supermarketMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Supermarket supermarket) {
        if (supermarket.getId() == 0) {
            return supermarketMapper.insert(supermarket);
        } else {
            return supermarketMapper.updateByPrimaryKey(supermarket);
        }
    }

    @Override
    public Pagination<Supermarket> selectByPage(SuperMarketRequestParam param) {
        Pagination pagination = new Pagination();
        int count = supermarketMapper.queryCount(param);
        if (count == 0) {
            return pagination;
        }
        pagination.setTotal(count);
        pagination.setData(supermarketMapper.selectByParam(param));
        return pagination;
    }
}
