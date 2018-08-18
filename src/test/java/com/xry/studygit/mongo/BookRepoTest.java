package com.xry.studygit.mongo;

import com.xry.studygit.mongo.entity.BookDO;
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
public class BookRepoTest {

    @Autowired
    private BookRepo bookRepo;

    @Test
    public void saveTest(){
        BookDO bookDO = new BookDO();
        bookDO.setAuthor("周树明");
        bookDO.setName("java虚拟机");
        bookDO.setPrice(29.8);

        BookDO res = bookRepo.save(bookDO);
        log.info("save book res = {}",res);
    }
}
