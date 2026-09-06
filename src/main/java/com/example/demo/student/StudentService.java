package com.example.demo.student;

import java.util.List;

public interface StudentService{
	
	Student save(Student student);
	List<Student> findAll();
}
