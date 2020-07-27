package com.baseauth.system.model;

import lombok.Data;

import java.util.Date;
@Data
public class UserGroup {

    /**
     *用户组编码
     */
    private int groupCode;
    /**
     *父用户组编码
     * 表自身关联
     */
    private int pgroupCode;

    /**
     *用户组名称
     */
    private String groupName;

    /**
     *用户组简称
     */
    private String simpleName;

    /**
     *用户组状态
     * 单值，0可用，1不可用
     */
    private String status;
    /**
     *备注
     */
    private String remark;

    public int getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(int groupCode) {
        this.groupCode = groupCode;
    }

    public int getPgroupCode() {
        return pgroupCode;
    }

    public void setPgroupCode(int pgroupCode) {
        this.pgroupCode = pgroupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UserGroup() {
    }

    public UserGroup(int groupCode, int pgroupCode, String groupName,String simpleName, String status, String remark) {
        this.groupCode = groupCode;
        this.pgroupCode = pgroupCode;
        this.groupName = groupName;
        this.simpleName = simpleName;
        this.status = status;
        this.remark = remark;
    }
}
