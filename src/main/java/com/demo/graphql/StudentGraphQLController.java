package com.demo.graphql;

import com.demo.model.Student;
import com.demo.service.DataService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentGraphQLController {

    private final DataService dataService;

    public StudentGraphQLController(DataService dataService) {
        this.dataService = dataService;
    }

    @QueryMapping
    public List<Student> students() {
        return dataService.getAllStudents();
    }

    @QueryMapping
    public Student student(@Argument Long id) {
        return dataService.getStudentById(id);
    }
}
