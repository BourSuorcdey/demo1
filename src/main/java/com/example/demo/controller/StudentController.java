package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student/")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("{id}")
    Student getStudent(@PathVariable("id") Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping
    void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("{id}")
    void deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
    }

}
