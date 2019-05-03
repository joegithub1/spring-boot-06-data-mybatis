package com.cn.controller;

import com.cn.bean.Teacher;
import com.cn.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherMapper teacherMapper;
    @GetMapping("/t/{id}")
    public Teacher getTeacherById(@PathVariable("id") Long id){


        return teacherMapper.getTeacherById(id);
    }

}
