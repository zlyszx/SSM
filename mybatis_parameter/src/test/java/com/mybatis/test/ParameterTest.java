package com.mybatis.test;

import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParameterTest {

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("张三");
        System.out.println(user);
    }

    @Test
    public void testcheckLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("张三","123456");
        System.out.println(user);
    }

    @Test
    public void testcheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Object> map = new HashMap<>();
        map.put("username","张三");
        map.put("password","123456");
//        User user = mapper.checkLogin("张三","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("username","张三");
//        map.put("password","123456");
//        User user = mapper.checkLogin("张三","123456");
//        User user = mapper.checkLoginByMap(map);
        User user = new User("huawei","123456",20,"男","anvrnicin@qq.com");
        int flag = mapper.insertUser(user);
        System.out.println(flag);
    }

    @Test
    public void testcheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("username","张三");
//        map.put("password","123456");
//        User user = mapper.checkLogin("张三","123456");
        User user = mapper.checkLoginByParam("张三","123456");
        System.out.println(user);
    }

}
