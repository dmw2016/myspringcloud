package com.baseauth.impl.system;

import com.baseauth.system.model.UserGroup;
import com.baseauth.system.service.UserGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dongmw on 2020/7/22 14:03
 */
@RestController
@RequestMapping(value = "/userGroup")
public class UserGroupWeb {
    @Resource
    private UserGroupService userGroupService;
    @PostMapping("/getUserGroup")
    public UserGroup getUserGroup(@RequestBody UserGroup userGroup){
        return userGroupService.getUserGroup(userGroup);
    }
//    @PostMapping("/getUserGroups")
    public List<UserGroup> getUserGroups(@RequestBody UserGroup userGroup){
        return userGroupService.getUserGroups(userGroup);
    }

    @PostMapping("/deleteUserGroup")
    public void deleteUserGroup( @RequestBody UserGroup userGroup){
        userGroupService.deleteUserGroup(userGroup);
    }
    @PostMapping("/updateUserGroup")
    public String updateUserGroup(@RequestBody UserGroup userGroup){
        if(checkFieldNull(userGroup)==""){
            userGroupService.updateUserGroup(userGroup);
            return "UserGroup信息更新成功。";
        }else{
            return checkFieldNull(userGroup);
        }
    }

    @PostMapping("/addUserGroup")
    public String addUserGroup(@RequestBody UserGroup userGroup){
        if(checkFieldNull(userGroup)==""){
            userGroupService.addUserGroup(userGroup);
            return "新增用户组成功。";
        }else{
            return checkFieldNull(userGroup);
        }
    }

    /**
     * 判断字段是否为空
     * @param userGroup
     * @return
     */
    private String checkFieldNull(UserGroup userGroup){

        if(userGroup.getGroupName()==null
                || "".equals(userGroup.getGroupName().trim())){
            return "用户组名称不能为空。";
        }else if(userGroup.getSimpleName()==null
                || "".equals(userGroup.getSimpleName().trim())){

            return "用户组简称不能为空。";
        }else if(userGroup.getPgroupCode()==0){
            return "用户组父组编码为能为空。";
        }else if(userGroup.getStatus()==null
                || "".equals(userGroup.getStatus().trim())
        ){
            return "用户组状态信息不能为空";
        }else if(userGroup.getGroupCode()==0){
            return "用户组编码不能为空。";
        }else{
            return "";
        }
    }
}
