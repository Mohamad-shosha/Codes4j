package com.shosha.springboot.demo.service;

import com.shosha.springboot.demo.error.exception.InstructorNotFoundException;
import com.shosha.springboot.demo.error.exception.SqlConstraintException;
import com.shosha.springboot.demo.model.dto.AddressDto;
import com.shosha.springboot.demo.model.dto.InstructorDto;
import com.shosha.springboot.demo.model.entity.Address;
import com.shosha.springboot.demo.model.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {

    List<InstructorDto> findAll();

    List<InstructorDto> findAllByFirstName(String firstName);

    Instructor findById(String id) throws InstructorNotFoundException;

    InstructorDto getInstructorDtoById(String id) throws InstructorNotFoundException;

    String findIdByEmail(String email) throws InstructorNotFoundException;

    String findCourseCodeByEmail(String email) throws InstructorNotFoundException;

    Optional<Instructor> findInstructorByEmail(String email) throws InstructorNotFoundException;

    AddressDto findAddressByEmail(String email) throws InstructorNotFoundException;

    void save(InstructorDto instructorDto) throws SqlConstraintException;

    void update(InstructorDto instructorDto, String id) throws InstructorNotFoundException;

    void delete(String id) throws InstructorNotFoundException;

}
