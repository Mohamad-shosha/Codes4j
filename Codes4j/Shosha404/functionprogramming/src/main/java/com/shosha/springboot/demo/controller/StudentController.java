package com.shosha.springboot.demo.controller;

import com.shosha.springboot.demo.student.Student;
import com.shosha.springboot.demo.student.StudentProcessFunctions;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Student")
public class StudentController {
    @GetMapping("FullName")
    public String getStudentName(@RequestBody Student student) {
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        return StudentProcessFunctions.getStudentFullName(student::getFullName,firstName,lastName);
    }
    @GetMapping("GetEmail")
    public String getStudentEmail(@RequestBody Student student) {
        return student.getEmail();
    }
}
