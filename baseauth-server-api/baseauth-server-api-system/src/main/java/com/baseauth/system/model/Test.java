package com.baseauth.system.model;

import lombok.Data;

/**
 * @title Test
 * @author: zxl
 * @description: 测试实体类
 * @date 2020/7/2022:03
 */
@Data
public class Test {
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;




    public Test(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
