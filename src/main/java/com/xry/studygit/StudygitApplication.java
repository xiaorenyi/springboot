package com.xry.studygit;

import com.xry.studygit.kafka.provider.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudygitApplication {


	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(StudygitApplication.class, args);
	}
}
