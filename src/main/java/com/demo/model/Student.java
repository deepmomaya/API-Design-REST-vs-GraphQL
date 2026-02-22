package com.demo.model;

import java.util.List;

public class Student {
    private Long id;
    private String name;
    private String email;
    private List<Course> courses;

    public Student(Long id, String name, String email, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courses = courses;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Course> getCourses() { return courses; }
}
