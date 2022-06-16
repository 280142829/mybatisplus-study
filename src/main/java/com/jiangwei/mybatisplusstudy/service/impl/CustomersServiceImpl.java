package com.jiangwei.mybatisplusstudy.service.impl;

import com.jiangwei.mybatisplusstudy.bean.Customers;
import com.jiangwei.mybatisplusstudy.dao.CustomersMapper;
import com.jiangwei.mybatisplusstudy.service.CustomersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jw
 * @since 2022-06-16
 */
@Service
public class CustomersServiceImpl extends ServiceImpl<CustomersMapper, Customers> implements CustomersService {

}
