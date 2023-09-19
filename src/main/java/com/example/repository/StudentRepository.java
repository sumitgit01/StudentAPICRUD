package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.student;

public interface StudentRepository extends JpaRepository<student, Long> {

}
