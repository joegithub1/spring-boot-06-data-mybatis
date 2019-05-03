package com.cn.mapper;

import com.cn.bean.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface StudentMapper {
    @Select("select * from t_student where id=#{id}")
    public Student getStudentById(Long id);
    //自动返回主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into t_student(age,name) values(#{age},#{name})")
    public int insertStudent(Student stu);
    @Delete("delete from t_student where id=#{id}")
    public int deleteById(Long id);
    @Update("update t_student set age=#{age},name=#{name} where id=#{id}")
    public int updateStudent(Student stu);
    @Select("select * from t_student")
    public List<Student> findAll();
}
