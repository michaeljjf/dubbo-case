package com.jiangjf.dubbo.service.impl;

import com.jiangjf.dubbo.service.EmpDubboService;
import com.jiangjf.mapper.EmpMapper;
import com.jiangjf.pojo.Emp;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@DubboService
public class EmpDubboServiceImpl implements EmpDubboService {

    @Resource
    private EmpMapper empMapper;

    /**
     * 新增员工
     *
     * @param emp
     * @return
     */
    @Override
    public int insertEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    @Override
    public List<Emp> findEmpByDeptId(Integer deptId) {
        return empMapper.findEmpByDeptId(deptId);
    }
}
