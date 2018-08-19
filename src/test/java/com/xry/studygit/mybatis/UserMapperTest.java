package com.xry.studygit.mybatis;

import com.xry.studygit.mongo.entity.CityDO;
import com.xry.studygit.mongo.repo.ggdb.CityRepo;
import com.xry.studygit.mybatis.entity.UserDO;
import com.xry.studygit.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllTest(){
        List<UserDO> userDOList =  userMapper.findAll();
        for (UserDO userDO : userDOList){
            log.info("user = {}",userDO);
        }
    }

}
