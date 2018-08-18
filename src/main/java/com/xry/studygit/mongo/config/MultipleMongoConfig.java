package com.xry.studygit.mongo.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MultipleMongoConfig {

    @Autowired
    private MultipleMongoProperties mongoProperties;

    @Primary
    @Bean(name = MMMongoConfig.MONGO_TEMPLATE)
    public MongoTemplate mmMongoTemplate() throws Exception {
        return new MongoTemplate(mmFactory(this.mongoProperties.getMmProperties()));
    }

    @Bean
    @Qualifier(GGMongoConfig.MONGO_TEMPLATE)
    public MongoTemplate ggMongoTemplate() throws Exception {
        return new MongoTemplate(ggFactory(this.mongoProperties.getGgProperties()));
    }

    @Bean
    @Primary
    public MongoDbFactory mmFactory(MongoProperties mongo) throws Exception {
        return builtMongoDbFactory(mongo);
    }

    @Bean
    public MongoDbFactory ggFactory(MongoProperties mongo) throws Exception {
        return builtMongoDbFactory(mongo);
    }

    private MongoDbFactory builtMongoDbFactory(MongoProperties mongo){
        ServerAddress addr = new ServerAddress(mongo.getHost(), mongo.getPort());
        List<MongoCredential> credentialList = new ArrayList<MongoCredential>();
        MongoCredential credential = MongoCredential.createCredential(mongo.getUsername(), mongo.getDatabase(), mongo.getPassword());
        credentialList.add(credential);
        MongoClient mongoClient = new MongoClient(addr, credentialList);
        return new SimpleMongoDbFactory(mongoClient, mongo.getDatabase());
    }
}
