package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class})
public class SpringAwsSqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSqsApplication.class, args);
	}

}
