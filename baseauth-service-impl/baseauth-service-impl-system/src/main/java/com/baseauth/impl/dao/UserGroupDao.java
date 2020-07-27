package com.baseauth.impl.dao;

import com.baseauth.system.model.UserGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by dongmw on 2020/7/22 12:09
 */
@Mapper
public interface UserGroupDao {
    @Mapper
    public UserGroup getUserGroup(UserGroup userGroup);

    @Mapper
    public List<UserGroup> getUserGroups(UserGroup userGroup);

    @Mapper
    public void deleteUserGroup(UserGroup userGroup);

    @Mapper
    public void updateUserGroup(UserGroup userGroup);

    @Mapper
    public void addUserGroup(UserGroup userGroup);

}
