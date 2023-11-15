package com.example15.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example15.model.Student;


public interface StudentRepository extends JpaRepository<Student ,Long>{

}
