package com.jiangjf.mapper;

import com.jiangjf.pojo.Emp;

import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/4
 */
public interface EmpMapper {
    /**
     * 新增员工
     *
     * @param emp
     * @return
     */
    int insertEmp(Emp emp);

    /**
     * 查找部门内员工信息
     *
     * @param deptId
     * @return
     */
    List<Emp> findEmpByDeptId(Integer deptId);
}
