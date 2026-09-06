package com.example.demo.student;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService{

	private final StudentRepository stuRepo;
	
	public StudentServiceImpl(StudentRepository stuRepo) {
		super();
		this.stuRepo = stuRepo;
	}
	
	@Override
	public Student save(Student student) {
		return stuRepo.save(student);
	}
	
	@Override
	public List<Student> findAll() {
		 return stuRepo.findAll();
	}
}