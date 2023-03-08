package com.mybatis.mapper;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 批量添加员工信息
     * @param empList
     */
    void insertMoreEmp(@Param("empList") List<Emp> empList);

    /**
     * 批量删除
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);

}
