package com.cn.controller;


import com.cn.bean.Student;
import com.cn.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/stu/{id}")
    @ResponseBody
    public Student getStudentById(Model model, @PathVariable("id") Long id){
        return studentMapper.getStudentById(id);
    }

    @GetMapping(value = "/stu")
    public Student saveStudent(Student stu){
        studentMapper.insertStudent(stu);
        return stu;
    }



}


