package com.xry.studygit.mongo;

import com.xry.studygit.mongo.entity.CityDO;
import com.xry.studygit.mongo.repo.ggdb.CityRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CityRepoTest {

    @Autowired
    private CityRepo cityRepo;

    @Test
    public void saveTest(){
        CityDO cityDO = new CityDO();
        cityDO.setName("阳江");
        cityDO.setSpecialty("阳江十八子");
        CityDO res = cityRepo.save(cityDO);
        log.info("save city res = {}",res);
    }

}
