package com.xry.studygit.mybatis.mapper;

import com.xry.studygit.mybatis.entity.UserDO;

import java.util.List;

public interface UserMapper {

     List<UserDO> findAll();
}
