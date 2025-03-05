package com.zky.springboot.mydemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zky.springboot.mydemo.error.StudentErrorResponse;
import com.zky.springboot.mydemo.error.StudentNotFoundException;


@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students/{studentId}")
    public StudentDTO getStudent(@PathVariable int studentId) {
        List<StudentDTO> students = new ArrayList<>();
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return students.get(studentId);
    }
}
