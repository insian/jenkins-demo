package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class JenkinsDemoApplication {
	private final StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		studentRepository.save(new Student("Soham", "soham@email.com"));
		studentRepository.save(new Student("Subho", "subho@email.com"));
		studentRepository.save(new Student("Shayam", "shayam@email.com"));
	}

}
