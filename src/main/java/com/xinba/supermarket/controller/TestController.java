package com.xinba.supermarket.controller;

import com.xinba.supermarket.common.BaseResult;
import com.xinba.supermarket.common.ControllerTempLate;
import com.xinba.supermarket.common.TemplateExecutor;
import com.xinba.supermarket.common.XinbaException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "test.json")
    public ModelMap test() {
        return TemplateExecutor.execute("test", new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {

            }

            @Override
            public void business(ModelMap modelMap) throws XinbaException {

                modelMap.put("test","hello");
            }
        });
    }
}
