package com.jiangwei.mybatisplusstudy.controller;


import com.jiangwei.mybatisplusstudy.bean.Customers;
import com.jiangwei.mybatisplusstudy.bean.Person;
import com.jiangwei.mybatisplusstudy.common.R;
import com.jiangwei.mybatisplusstudy.common.ReturnR;
import com.jiangwei.mybatisplusstudy.service.CustomersService;
import com.jiangwei.mybatisplusstudy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jw
 * @since 2022-06-16
 */
@RestController
@RequestMapping("/customers")
public class CustomersController {
    @Autowired
    CustomersService customersService;
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        Customers byId = customersService.getById(id);
        return ReturnR.objToR("Customers",byId);
    }
}

