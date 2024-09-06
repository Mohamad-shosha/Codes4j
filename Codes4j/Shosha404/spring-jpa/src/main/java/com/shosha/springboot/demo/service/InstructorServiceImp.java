package com.shosha.springboot.demo.service;

import com.shosha.springboot.demo.dao.courserepository.CourseRepository;
import com.shosha.springboot.demo.dao.instructorrepository.InstructorRepository;
import com.shosha.springboot.demo.error.exception.SqlConstraintException;
import com.shosha.springboot.demo.model.dto.InstructorDto;
import com.shosha.springboot.demo.model.entity.Instructor;
import com.shosha.springboot.demo.util.transformation.InstructorTransformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class InstructorServiceImp implements InstructorService {
    private final InstructorRepository instructorRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public InstructorServiceImp(InstructorRepository instructorRepository, CourseRepository courseRepository) {
        this.instructorRepository = instructorRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void save(InstructorDto instructorDto) throws SqlConstraintException {
        Instructor instructor = InstructorTransformation.transformToStudent(instructorDto);
        if (instructorRepository.existsByEmail(instructorDto.getEmail()) ||
                courseRepository.existsByNameAndCode(instructor.getCourse().getName(),
                        instructorDto.getCourse().getCode())) {
            log.error("Duplicated data with email '{}' or course name '{}' or course code '{}' ",
                    instructorDto.getEmail(),
                    instructorDto.getCourse().getName(),
                    instructorDto.getCourse().getCode());
            throw new SqlConstraintException("Rovan not be allowed the Duplicate data entry ");
        }
        instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }
}
