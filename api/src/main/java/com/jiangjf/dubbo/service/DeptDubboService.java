package com.jiangjf.dubbo.service;

import com.jiangjf.pojo.Dept;

import java.util.List;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
public interface DeptDubboService {
    List<Dept> findAll();
}
