package com.jiangjf.service.impl;

import com.jiangjf.dubbo.service.DeptDubboService;
import com.jiangjf.dubbo.service.EmpDubboService;
import com.jiangjf.pojo.Dept;
import com.jiangjf.pojo.Emp;
import com.jiangjf.service.EmpService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * @author jiangjf
 * @date 2021/10/5
 */
@Service
public class EmpServiceImpl implements EmpService {

    @DubboReference
    private DeptDubboService deptDubboService;
    @DubboReference
    private EmpDubboService empDubboService;

    @Override
    public List<Dept> showDept() {
        return deptDubboService.findAll();
    }

    @Override
    public int insert(Emp emp, MultipartFile file) {
        if (file != null) {
            try {
                // 获取request对象
                HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                // 获取存储路径
                String path = request.getServletContext().getRealPath("/img");
                System.out.println("path = " + path);
                // 拼接新文件文件名
                long currentTimeMillis = System.currentTimeMillis();
                Random random = new Random();
                String oldFileName = file.getOriginalFilename();
                // 高并发时防止重名
                String fileName = currentTimeMillis + "" + random.nextInt(1000);
                // 拿到文件扩展名
                fileName += oldFileName.substring(oldFileName.lastIndexOf("."));

                File pathFile = new File(path);
                if (!pathFile.exists()) {
                    pathFile.mkdirs();
                }
                file.transferTo(new File(path, fileName));
                emp.setPhoto("http://localhost:8081/img/" + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return empDubboService.insertEmp(emp);
    }

    @Override
    public List<Emp> findEmpByDeptId(Integer deptId) {
        return empDubboService.findEmpByDeptId(deptId);
    }
}
