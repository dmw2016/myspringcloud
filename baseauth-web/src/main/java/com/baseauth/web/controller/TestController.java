package com.baseauth.web.controller;

import com.baseauth.system.model.Test;
import com.baseauth.web.fegin.TestFegin;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxl
 * @ClassName
 * @Description
 * @create 2020/7/21
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试接口服务")
public class TestController {

//    @Autowired
//    private TestService testService;
    @Autowired
    private TestFegin testFegin;

    @GetMapping("/getTest")
    public Test getTest() {
        return testFegin.getTest();
    }

}