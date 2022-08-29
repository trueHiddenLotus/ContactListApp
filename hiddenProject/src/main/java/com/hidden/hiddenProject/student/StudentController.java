package com.hidden.hiddenProject.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("student")
public class StudentController {



    @GetMapping
    public List<Student> getAllStudents() {
                Student s1 = new Student(UUID.randomUUID(), "Lamar", "Roberts", "squall@gmail.com", Student.Gender.MALE);
                Student s2 = new Student(UUID.randomUUID(), "Anna", "Black", "gush@gmail.com", Student.Gender.FEMALE);
                Student s3 = new Student(UUID.randomUUID(), "Mylene", "Stock", "hamming@gmail.com", Student.Gender.FEMALE);
        List<Student> studentList = new ArrayList<>();
                studentList.add(s1);
                studentList.add(s2);
                studentList.add(s3);
                return studentList;

    }
}
