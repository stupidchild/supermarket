package com.xinba.supermarket.service;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.UserRequestParam;
import com.xinba.supermarket.entity.User;

public interface UserService {

    User queryById(int id);

    int save(User user);

    Pagination<User> selectByPage(UserRequestParam param);
}
