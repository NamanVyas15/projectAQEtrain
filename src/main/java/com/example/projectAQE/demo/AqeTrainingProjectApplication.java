package com.example.projectAQE.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class AqeTrainingProjectApplication {


	@GetMapping("/hello")
	public String sayhello(){
		return "helloworld"; //file name

	}
	@GetMapping("/h")
	public String say(){
		return "jk"; //file name

	}
	@GetMapping("/z")
	public String aon(){
		return "hello there!!"; //file name

	}
	public static void main(String[] args) {
		SpringApplication.run(AqeTrainingProjectApplication.class, args);
	}

}
