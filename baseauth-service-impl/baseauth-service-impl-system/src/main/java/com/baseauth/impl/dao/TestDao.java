package com.baseauth.impl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zxl
 * @ClassName
 * @Description
 * @create 2020/7/21
 */
@Mapper
public interface TestDao {
    
    int getInt();

}