package com.jiangjf.dubbo.service;

import com.jiangjf.pojo.Emp;

import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
public interface EmpDubboService {
    /**
     * 新增员工
     *
     * @param emp
     * @return
     */
    int insertEmp(Emp emp);

    /**
     * 查找部门内员工列表
     *
     * @param deptId
     * @return
     */
    List<Emp> findEmpByDeptId(Integer deptId);
}
