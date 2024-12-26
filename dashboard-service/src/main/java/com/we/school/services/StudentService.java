package com.we.school.services;

import com.we.school.dao.StudentRepository;
import com.we.school.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
   private final StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public Student getById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }
}
