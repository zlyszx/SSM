package com.mybatis.test;

import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.pojo.EmpExample;
import com.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {

    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
//        List<Emp> list = mapper.selectByExample(null);
//        list.forEach(System.out::println);
//        EmpExample example = new EmpExample();
//        example.createCriteria().andEmpNameEqualTo("张三").andAgeEqualTo(20);
//        example.or().andGenderEqualTo("男");
//        List<Emp> list = mapper.selectByExample(example);
//        list.forEach(System.out::println);
        Emp emp = new Emp(1,"小黑",null,"女");
//        mapper.updateByPrimaryKey(emp);
        mapper.updateByPrimaryKeySelective(emp);
    }
}
