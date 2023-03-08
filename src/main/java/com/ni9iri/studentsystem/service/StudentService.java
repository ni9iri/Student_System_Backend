package com.ni9iri.studentsystem.service;

import com.ni9iri.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
