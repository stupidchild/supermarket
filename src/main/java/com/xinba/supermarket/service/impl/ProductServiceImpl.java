package com.xinba.supermarket.service.impl;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.ProductRequestParam;
import com.xinba.supermarket.dao.ProductMapper;
import com.xinba.supermarket.entity.Product;
import com.xinba.supermarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product queryById(int id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Product product) {
        if (product.getId() == 0) {
            return productMapper.insert(product);
        } else {
            return productMapper.updateByPrimaryKey(product);
        }
    }

    @Override
    public Pagination<Product> selectByPage(ProductRequestParam param) {
        Pagination pagination = new Pagination();
        int count = productMapper.queryCount(param);
        if (count == 0) {
            return null;
        }
        pagination.setTotal(count);
        pagination.setData(productMapper.selectByParam(param));
        return pagination;
    }
}
