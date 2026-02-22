package com.demo.service;

import com.demo.model.Course;
import com.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataService {

    private final List<Course> courses = Arrays.asList(
        new Course(1L, "Data Structures", "Dr. Smith"),
        new Course(2L, "Databases", "Prof. Brown")
    );

    private final List<Student> students = Arrays.asList(
        new Student(1L, "Alice", "alice@example.com", courses),
        new Student(2L, "Bob", "bob@example.com", courses)
    );

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(Long id) {
        return students.stream()
            .filter(s -> s.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
