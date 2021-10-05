package com.jiangjf.controller;

import com.jiangjf.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@Controller
public class DeptController {

    @Resource
    private DeptService deptService;

    @GetMapping("/dept")
    public String showDept(Model model) {
        model.addAttribute("list", deptService.findAll());
        return "dept";
    }
}
