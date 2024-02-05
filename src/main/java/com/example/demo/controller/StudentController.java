package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {
	private final StudentService studentService;
	
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAll();
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student){
		return studentService.addStudent(student);
	}
}
