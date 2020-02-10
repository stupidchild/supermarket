package com.xinba.supermarket.service;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.ProductRequestParam;
import com.xinba.supermarket.entity.Product;

public interface ProductService {

    Product queryById(int id);

    int save(Product product);

    Pagination<Product> selectByPage(ProductRequestParam param);
}
