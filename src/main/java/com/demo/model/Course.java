package com.demo.model;

public class Course {
    private Long id;
    private String title;
    private String instructor;

    public Course(Long id, String title, String instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getInstructor() { return instructor; }
}
