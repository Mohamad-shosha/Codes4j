package com.shosha.springboot.demo.designpattern.service;

import com.shosha.springboot.demo.designpattern.error.exception.IsEmpty;
import com.shosha.springboot.demo.designpattern.error.exception.StudentNotFoundException;
import com.shosha.springboot.demo.designpattern.model.dto.StudentDto;
import com.shosha.springboot.demo.designpattern.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface DbConnectionService {
    void addStudent(StudentDto student);

    Student findStudentById(String id) throws StudentNotFoundException;

    Collection<StudentDto> getStudents();

    StudentDto getStudent(String id);

    void updateStudent(String id, StudentDto updatedStudentDto);

    void deleteStudentById(String id);

    int countStudents();

    void clear() throws IsEmpty;
}
