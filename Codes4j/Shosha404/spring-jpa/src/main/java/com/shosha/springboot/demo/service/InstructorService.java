package com.shosha.springboot.demo.service;

import com.shosha.springboot.demo.error.exception.SqlConstraintException;
import com.shosha.springboot.demo.model.dto.InstructorDto;
import com.shosha.springboot.demo.model.entity.Instructor;

import java.util.List;

public interface InstructorService {

    void save(InstructorDto instructorDto) throws SqlConstraintException;

    List<Instructor> findAll();
}
