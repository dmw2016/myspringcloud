package com.baseauth.impl.system;

import com.baseauth.system.model.Test;
import com.baseauth.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title TestServiceImpl
 * @author: zxl
 * @description:
 * @date 2020/7/2022:12
 */
@RestController
@RequestMapping(value = "/test")
public class TestWeb {

    @Autowired
    private TestService testService;

    @GetMapping("/getTest")
    public Test getTest() {
        return testService.getTest();
    }
}
