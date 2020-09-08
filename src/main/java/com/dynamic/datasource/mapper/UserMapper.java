package com.dynamic.datasource.mapper;

import com.dynamic.datasource.config.MyMapper;
import com.dynamic.datasource.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}
