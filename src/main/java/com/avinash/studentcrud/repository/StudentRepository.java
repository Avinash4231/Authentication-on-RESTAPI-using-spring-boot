package com.avinash.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.studentcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
