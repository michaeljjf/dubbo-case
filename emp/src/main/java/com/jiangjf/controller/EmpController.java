package com.jiangjf.controller;

import com.jiangjf.pojo.Emp;
import com.jiangjf.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@Controller
public class EmpController {
    @Resource
    private EmpService empService;

    @GetMapping("/empadd")
    public String empAdd(Model model) {
        model.addAttribute("list", empService.showDept());
        return "emp-add";
    }

    @PostMapping("/add")
    public String add(Emp emp, MultipartFile file, Model model) {
        empService.insert(emp, file);
        model.addAttribute("list", empService.showDept());
        return "emp-add";
    }

    @GetMapping("/emplist")
    public String empList(@RequestParam("dept_id") Integer deptId, Model model) {
        model.addAttribute("list", empService.findEmpByDeptId(deptId));
        return "emp-list";
    }
}
