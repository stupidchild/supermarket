package com.xinba.supermarket.controller;

import com.xinba.supermarket.common.BaseResult;
import com.xinba.supermarket.common.ControllerTempLate;
import com.xinba.supermarket.common.TemplateExecutor;
import com.xinba.supermarket.common.XinbaException;
import com.xinba.supermarket.controller.request.SuperMarketRequestParam;
import com.xinba.supermarket.entity.Goods;
import com.xinba.supermarket.entity.Supermarket;
import com.xinba.supermarket.service.SuperMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superMarket")
public class SuperMarketController {

    private static String TITLE = "超市信息";

    @Autowired
    private SuperMarketService superMarketService;

    @RequestMapping(value = "query.json")
    public ModelMap query(@RequestBody SuperMarketRequestParam param) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", superMarketService.selectByPage(param));
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
                modelMap.put("data", superMarketService.queryById(id));
            }
        });
    }

    @RequestMapping(value = "save.json")
    public ModelMap save(@RequestBody Supermarket supermarket) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", superMarketService.save(supermarket));
            }
        });
    }
}
