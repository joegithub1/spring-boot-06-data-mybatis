package com.cn.mapper;

import com.cn.bean.Department;

public interface DepartmentMapper {
    public Department getDepartmentById(Integer id);
    public void insertDepartment(Department dept);
}
