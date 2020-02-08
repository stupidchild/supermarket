package com.xinba.supermarket.controller;

import com.xinba.supermarket.common.BaseResult;
import com.xinba.supermarket.common.ControllerTempLate;
import com.xinba.supermarket.common.TemplateExecutor;
import com.xinba.supermarket.common.XinbaException;
import com.xinba.supermarket.controller.request.UserRequestParam;
import com.xinba.supermarket.entity.User;
import com.xinba.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制类
 */
@RestController
@RequestMapping(value="/user")
public class UserController {

    private static String TITLE = "用户信息";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "query.json")
    public ModelMap query(@RequestBody UserRequestParam param) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", userService.selectByPage(param));
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
                modelMap.put("data", userService.queryById(id));
            }
        });
    }

    @RequestMapping(value = "insert.json")
    public ModelMap insert(@RequestBody User user) {
        return TemplateExecutor.execute(TITLE, new BaseResult(), new ControllerTempLate() {
            @Override
            public void verifier(ModelMap modelMap) throws XinbaException {}

            @Override
            public void business(ModelMap modelMap) throws XinbaException {
                modelMap.put("data", userService.insert(user));
            }
        });
    }
}
