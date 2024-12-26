package com.we.school.controller;

import com.we.school.model.Student;
import com.we.school.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getTest(@PathVariable("id") Integer id){
        return ResponseEntity.ok(studentService.getById(id));
    }

    @PutMapping("/create")
    public ResponseEntity<Student> create(@RequestBody Student student){
        return ResponseEntity.ok(studentService.createStudent(student));
    }
}
