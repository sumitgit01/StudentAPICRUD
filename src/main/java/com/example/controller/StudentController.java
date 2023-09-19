package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.student;
import com.example.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/student")
	public String createNewStudent(@RequestBody student Student)	{
	studentRepository.save(Student);
	return "Student created in Database";
	}
	@GetMapping("/student")
	public ResponseEntity<List<student>> getAllstudent() {
		List<student> stdList = new ArrayList<>();
		studentRepository.findAll().forEach(stdList::add);
		return new ResponseEntity<List<student>>(stdList, HttpStatus.OK);
	}
	}

