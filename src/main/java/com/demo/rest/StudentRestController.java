package com.demo.rest;

import com.demo.model.Student;
import com.demo.service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

    private final DataService dataService;

    public StudentRestController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return dataService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return dataService.getStudentById(id);
    }
}
