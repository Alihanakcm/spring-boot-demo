package com.alihanakcam.aamongodbexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AaMongodbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AaMongodbExampleApplication.class, args);
	}

}
