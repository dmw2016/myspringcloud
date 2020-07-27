package com.baseauth.web.fegin;

import com.baseauth.system.model.Test;
import com.baseauth.system.service.TestService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zxl
 * @ClassName
 * @Description
 * @create 2020/7/21
 */
@FeignClient(value = "baseauth-service-system")
public interface TestFegin extends TestService {
    
}