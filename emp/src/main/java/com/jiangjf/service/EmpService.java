package com.jiangjf.service;

import com.jiangjf.pojo.Dept;
import com.jiangjf.pojo.Emp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
public interface EmpService {
    /**
     * 返回部门列表
     *
     * @return
     */
    List<Dept> showDept();

    /**
     * 新增员工
     *
     * @param emp
     * @param file
     * @return
     */
    int insert(Emp emp, MultipartFile file);

    /**
     * 查找部门内员工列表
     *
     * @param deptId
     * @return
     */
    List<Emp> findEmpByDeptId(Integer deptId);
}
