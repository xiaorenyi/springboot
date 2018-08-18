package com.xry.studygit.mongo;

import com.xry.studygit.mongo.entity.BookDO;
import com.xry.studygit.mongo.entity.CityDO;
import com.xry.studygit.mongo.repo.ggdb.CityRepo;
import com.xry.studygit.mongo.repo.mmdb.BookRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MuliDatabaseTest {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private CityRepo cityRepo;

    @Test
    public void muliDbTest(){

        BookDO bookDO = new BookDO();
        bookDO.setAuthor("蔡叔叔");
        bookDO.setName("认知突围");
        bookDO.setPrice(29.3);
        BookDO bookRes = bookRepo.save(bookDO);
        log.info("save book res = {}",bookRes);

        CityDO cityDO = new CityDO();
        cityDO.setName("上海");
        cityDO.setSpecialty("东方之珠");
        CityDO cityRes = cityRepo.save(cityDO);
        log.info("save city res = {}",cityRes);
    }
}
