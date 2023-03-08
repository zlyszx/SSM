package com.mybatis.test;

import com.mybatis.mapper.SelectMapper;
import com.mybatis.mapper.SpecialSQLMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.Class.forName;

public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
//        System.out.println(list);
        list.forEach(System.out::println);
    }

    @Test
    public void testDeleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
//        List<User> list = mapper.getUserByLike("a");
//        System.out.println(list);
        mapper.deleteMoreUser("8,9");
//        list.forEach(System.out::println);
    }

    /*
    此方法不可行
    @Test
    public void testDeleteMoreUser1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
//        List<User> list = mapper.getUserByLike("a");
//        System.out.println(list);
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        mapper.deleteMoreUser1(list);
//        list.forEach(System.out::println);
    }
     */
    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
//        List<User> list = mapper.getUserByLike("a");
//        System.out.println(list);
        List<User> list = mapper.getUserList("t_user");
//        mapper.deleteMoreUser("8,9");
//        list.forEach(System.out::println);
        list.forEach(System.out::println);
    }

    @Test
    public void testJDBC() {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("","","");
//            String sql = "";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, "a");
            String sql = "insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            resultSet.next();
            int id = resultSet.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User("xiaoming", "hua",12,"男","1294847576@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }



}
