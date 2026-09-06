package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.student.Student;
import com.example.demo.student.StudentService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
//@RequiredArgsConstructor
public class SimpleSpringProjectApplication {
	
//	private final StudentService studentService;
//	
//	@Bean
//	ApplicationRunner runner() {
//		return r -> {
//			var stu = studentService.save(new Student("Maung Maung"));
//			System.out.println("Name is : " + stu.getName());
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringProjectApplication.class, args);
	}

}
