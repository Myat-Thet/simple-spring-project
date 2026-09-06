package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

	private final StudentService stuService;
	
	@GetMapping("/find")
	public String findAll(Model model) {
		
		List<Student> students = stuService.findAll();
		model.addAttribute("students", students);
		return "students";
	}
	
	@PostMapping("/save")
	public String save(Student student ) {
		
		stuService.save(student);
		return "/redirect:/students";
	}
	@GetMapping("/add-student")
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());
			
		return "add-student";
	}
}
