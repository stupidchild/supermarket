package com.xinba.supermarket.service.impl;

import com.xinba.supermarket.common.Pagination;
import com.xinba.supermarket.controller.request.UserRequestParam;
import com.xinba.supermarket.dao.UserMapper;
import com.xinba.supermarket.entity.User;
import com.xinba.supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(User user) {
        if (user.getId() == 0) {
            return userMapper.insert(user);
        } else {
            return userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public Pagination<User> selectByPage(UserRequestParam param) {
        Pagination pagination = new Pagination();
        int count = userMapper.queryCount(param);
        if (count == 0) {
            return null;
        }
        pagination.setTotal(count);
        pagination.setData(userMapper.selectByParam(param));
        return pagination;
    }
}
