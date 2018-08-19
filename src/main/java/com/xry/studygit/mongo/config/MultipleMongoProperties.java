package com.xry.studygit.mongo.config;


import com.xry.studygit.mongo.config.property.GGProperties;
import com.xry.studygit.mongo.config.property.MMProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

//    private MongoProperties mmProperties = new MongoProperties();
//    private MongoProperties ggProperties = new MongoProperties();

    private MMProperties mmProperties;

    private GGProperties ggProperties;

}
