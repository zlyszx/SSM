package com.mybatis.test;

import com.mybatis.mapper.CacheMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {

    @Test
    public void testGetEmpById() {
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
//        Emp emp3 = new Emp(null,"黎明",23,"男");
//        mapper1.insertEmp(emp3);
        sqlSession1.clearCache();
        Emp emp2 = mapper1.getEmpById(1);
        System.out.println(emp2);
//        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
//        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
//        Emp emp2 = mapper2.getEmpById(1);
//        System.out.println(emp2);
    }

    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CacheMapper cacheMapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = cacheMapper1.getEmpById(1);
        System.out.println(emp1);
        sqlSession1.close();
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper cacheMapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = cacheMapper2.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();
    }
}
