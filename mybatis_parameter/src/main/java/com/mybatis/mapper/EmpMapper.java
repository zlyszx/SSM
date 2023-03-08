package com.mybatis.mapper;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    Emp getEmpByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 分步查询，先查emp
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 分步查询第二步，部门及所有员工，根据第一步的empId查询员工
     * @param
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);

}
