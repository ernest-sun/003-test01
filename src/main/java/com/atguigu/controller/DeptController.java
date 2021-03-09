package com.atguigu.controller;

import com.atguigu.mapper.DepartMapper;
import com.atguigu.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:DeptController
 * Package:com.atguigu.controller
 * Description:
 *
 * @Date:2021/3/5 16:14
 * @Author:sunzheng@bmrj.com
 */
@RestController
@SuppressWarnings("all")
public class DeptController {
    @Autowired
    private DepartMapper departMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departMapper.getDeptById(id);
    }

    @RequestMapping("/dept")
    public Department insertDept( Department department) {

        int i = 100/5;
        System.out.println(i);

        departMapper.insertDept(department);

        return department;
    }
}
