package com.avinash.studentcrud.service;

import com.avinash.studentcrud.entity.Student;
import java.util.*;

public interface StudentService {
    List<Student> getAllStudents();

    boolean updateStudent(Student student, Long id);

    void createStudent(Student student);

    boolean deleteStudentById(Long id);

    Student getStudentById(Long id);
}
