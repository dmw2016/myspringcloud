package com.baseauth.system.service;

import com.baseauth.system.model.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @title TestService
 * @author: zxl
 * @description:
 * @date 2020/7/2022:05
 */
public interface TestService {
    /**
     * 应用服务测试
     *
     * @return
     */
    @GetMapping("/test/getTest")
    public Test getTest();

}
