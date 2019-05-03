package com.cn.mapper;

import com.cn.bean.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    //测试驼峰命名
    @Select("select * from t_tearcher where t_id = #{id}")
    public Teacher getTeacherById(Long id);

}
