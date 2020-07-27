package com.baseauth.web.controller;

import com.baseauth.system.model.UserGroup;
import com.baseauth.web.fegin.UserGroupFegin;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by dongmw on 2020/7/22 14:49
 */
@RestController
@RequestMapping("/userGroup")
@Api(tags = "用户组管理")
public class UserGroupController {
    @Resource
    private UserGroupFegin userGroupFegin;
    @PostMapping("/getUserGroup")
    public UserGroup getUserGroup( UserGroup userGroup){
        return userGroupFegin.getUserGroup( userGroup);
    }
    @PostMapping("/deleteUserGroup")
    public void deleteUserGroup(UserGroup userGroup){
        userGroupFegin.deleteUserGroup(userGroup);
    }
    @PostMapping("/updateUserGroup")
    public void updateUserGroup(UserGroup userGroup){
        userGroupFegin.updateUserGroup(userGroup);
    }
    @PostMapping("/addUserGroup")
    public void addUserGroup(UserGroup userGroup){
        userGroupFegin.addUserGroup(userGroup);
    }
}
