package com.jiangwei.mybatisplusstudy.service.impl;

import com.jiangwei.mybatisplusstudy.bean.Person;
import com.jiangwei.mybatisplusstudy.dao.PersonMapper;
import com.jiangwei.mybatisplusstudy.service.PersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
