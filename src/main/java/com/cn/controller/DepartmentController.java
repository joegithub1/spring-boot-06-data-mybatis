package com.cn.controller;

import com.cn.bean.Department;
import com.cn.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;
    @GetMapping(value = "/dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id){

        return departmentMapper.getDepartmentById(id);
    }
}
