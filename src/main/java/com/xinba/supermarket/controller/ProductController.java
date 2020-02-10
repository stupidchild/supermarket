package com.xinba.supermarket.controller;

import com.xinba.supermarket.common.BaseResult;
import com.xinba.supermarket.common.ControllerTempLate;
import com.xinba.supermarket.common.TemplateExecutor;
import com.xinba.supermarket.common.XinbaException;
import com.xinba.supermarket.controller.request.ProductRequestParam;
import com.xinba.supermarket.entity.Product;
import com.xinba.supermarket.entity.User;
import com.xinba.supermarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/product")
public class ProductController {

    private static String TITLE = "商品信息";

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "query.json")
    public ModelMap query(@RequestBody ProductRequestParam param) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", productService.selectByPage(param));
            }
        });
    }



    @RequestMapping(value = "queryById.json")
    public ModelMap queryById(Integer id) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", productService.queryById(id));
            }
        });
    }

    @RequestMapping(value = "save.json")
    public ModelMap save(@RequestBody Product product) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", productService.save(product));
            }
        });
    }

}
