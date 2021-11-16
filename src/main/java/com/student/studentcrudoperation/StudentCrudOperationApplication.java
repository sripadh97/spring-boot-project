package com.student.studentcrudoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.student.model")
@EnableJpaRepositories("com.student.repository")
@ComponentScan(basePackages = "com.student.controller, com.student.service")
public class StudentCrudOperationApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentCrudOperationApplication.class, args);
	}

}
