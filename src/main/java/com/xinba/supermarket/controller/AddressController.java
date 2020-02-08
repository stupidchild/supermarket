package com.xinba.supermarket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 地址控制类
 */
@RestController
@RequestMapping(value = "address")
public class AddressController {

    @RequestMapping(value = "query.json")
    public void query() {

    }

    @RequestMapping(value = "queryById.json")
    public void queryById() {

    }

    @RequestMapping(value = "insert.json")
    public void insert() {

    }
}
