package com.xry.studygit.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class BaseDO {

    @Id
    private String _id;

    private Long createTime;

    private Long updateTime;
}
