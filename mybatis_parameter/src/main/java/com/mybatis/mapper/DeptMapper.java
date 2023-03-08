package com.mybatis.mapper;

import com.mybatis.pojo.Dept;
import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 分步查询第二步
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     *分步查询部门及所有员工信息，第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
