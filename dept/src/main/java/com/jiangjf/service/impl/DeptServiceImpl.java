package com.jiangjf.service.impl;

import com.jiangjf.dubbo.service.DeptDubboService;
import com.jiangjf.pojo.Dept;
import com.jiangjf.service.DeptService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@Service
public class DeptServiceImpl implements DeptService {

    @DubboReference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> findAll() {
        return deptDubboService.findAll();
    }
}
