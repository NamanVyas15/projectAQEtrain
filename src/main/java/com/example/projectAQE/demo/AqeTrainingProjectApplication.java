package com.example.projectAQE.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AqeTrainingProjectApplication {

	@GetMapping("/message")
	public String message(){
		return "hello world";
}
	public static void main(String[] args) {
		SpringApplication.run(AqeTrainingProjectApplication.class, args);
	}

}
