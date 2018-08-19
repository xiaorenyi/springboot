package com.xry.studygit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xry.studygit.mybatis.mapper")
public class StudygitApplication {


	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(StudygitApplication.class, args);
	}
}
