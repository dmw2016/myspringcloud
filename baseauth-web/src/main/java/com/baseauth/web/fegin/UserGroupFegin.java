package com.baseauth.web.fegin;

import com.baseauth.system.service.UserGroupService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by dongmw on 2020/7/22 14:51
 */
@FeignClient(value = "baseauth-service-system")
public interface UserGroupFegin extends UserGroupService {

}
