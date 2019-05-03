package com.cn.mapper;

import com.cn.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserById(Long id);

    public int deleteUserById(Long id);

    public int insertUser(User user);
}
