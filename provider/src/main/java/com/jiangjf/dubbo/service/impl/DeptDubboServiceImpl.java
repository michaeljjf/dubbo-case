package com.jiangjf.dubbo.service.impl;

import com.jiangjf.dubbo.service.DeptDubboService;
import com.jiangjf.mapper.DeptMapper;
import com.jiangjf.pojo.Dept;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@DubboService
public class DeptDubboServiceImpl implements DeptDubboService {
    @Resource
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
