package com.baseauth.system.service;

import com.baseauth.system.model.UserGroup;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by dongmw on 2020/7/22 11:02
 */
public interface UserGroupService {
    @PostMapping("/userGroup/getUserGroup")
    public UserGroup getUserGroup(UserGroup userGroup);

    @PostMapping("/userGroup/getUserGroups")
    public List<UserGroup> getUserGroups(UserGroup userGroup);

    @PostMapping("/userGroup/deleteUserGroup")
    public void deleteUserGroup(UserGroup userGroup);

    @PostMapping("/userGroup/updateUserGroup")
    public void updateUserGroup(UserGroup userGroup);

    @PostMapping("/userGroup/addUserGroup")
    public void addUserGroup(UserGroup userGroup);


}
