package com.shosha.springboot.demo.controller;

import com.shosha.springboot.demo.dao.addressrepository.AddressRepository;
import com.shosha.springboot.demo.dao.courserepository.CourseRepository;
import com.shosha.springboot.demo.error.exception.SqlConstraintException;
import com.shosha.springboot.demo.model.dto.InstructorDto;
import com.shosha.springboot.demo.model.entity.Instructor;
import com.shosha.springboot.demo.service.InstructorService;
import com.shosha.springboot.demo.util.transformation.InstructorTransformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final InstructorService instructorService;

    public StudentController(InstructorService instructorService, AddressRepository addressRepository, CourseRepository courseRepository) {
        this.instructorService = instructorService;
    }

    @PostMapping("SaveStudent")
    public void saveStudent(@RequestBody InstructorDto instructorDto) throws SqlConstraintException {
        instructorService.save(instructorDto);
    }

    @GetMapping("GetStudents")
    public List<InstructorDto> getStudents() {
        List<Instructor> instructors = instructorService.findAll();
        return instructors.stream().map(InstructorTransformation::transformToStudentDto).toList();
    }
}
