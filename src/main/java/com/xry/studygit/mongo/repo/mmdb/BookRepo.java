package com.xry.studygit.mongo.repo.mmdb;

import com.xry.studygit.mongo.entity.BookDO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<BookDO,String> {
}
