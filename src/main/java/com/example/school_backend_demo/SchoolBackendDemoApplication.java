package com.example.school_backend_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SchoolBackendDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SchoolBackendDemoApplication.class, args);
	}

}
