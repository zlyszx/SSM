package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {

    List<User> getUserByLike(@Param("mohu") String mohu);

    void deleteMoreUser(@Param("ids") String ids);

    // 此方法不可行
    void deleteMoreUser1(@Param("ids") List ids);

    /**
     * 动态设置表名
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    void insertUser(User user);

}
