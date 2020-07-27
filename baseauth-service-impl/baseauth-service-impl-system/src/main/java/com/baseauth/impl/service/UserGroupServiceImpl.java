package com.baseauth.impl.service;

import com.baseauth.impl.dao.UserGroupDao;
import com.baseauth.system.model.UserGroup;
import com.baseauth.system.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dongmw on 2020/7/22 14:01
 */
@Service
public class UserGroupServiceImpl implements UserGroupService {
    @Resource
    private UserGroupDao userGroupDao;

    @Override
    public UserGroup getUserGroup(UserGroup userGroup) {
        return  userGroupDao.getUserGroup(userGroup);
    }

    @Override
    public List<UserGroup> getUserGroups(UserGroup userGroup) {
        return userGroupDao.getUserGroups(userGroup);
    }

    @Override
    public void deleteUserGroup(UserGroup userGroup) {
        userGroupDao.deleteUserGroup(userGroup);
    }

    @Override
    public void updateUserGroup(UserGroup userGroup) {
        userGroupDao.updateUserGroup(userGroup);
    }

    @Override
    public void addUserGroup(UserGroup userGroup) {
        userGroupDao.addUserGroup(userGroup);
    }
}
