package com.baseauth.impl.service;

import com.baseauth.impl.dao.TestDao;
import com.baseauth.system.model.Test;
import com.baseauth.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zxl
 * @ClassName
 * @Description
 * @create 2020/7/21
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;
    @Override
    public Test getTest() {
       int a =  testDao.getInt();
        System.out.println(a);
        return new Test("zxl",25);
    }
}