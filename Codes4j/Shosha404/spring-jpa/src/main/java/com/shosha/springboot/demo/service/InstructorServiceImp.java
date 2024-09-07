package com.shosha.springboot.demo.service;

import com.shosha.springboot.demo.dao.courserepository.CourseRepository;
import com.shosha.springboot.demo.dao.instructorrepository.InstructorRepository;
import com.shosha.springboot.demo.error.exception.InstructorNotFoundException;
import com.shosha.springboot.demo.error.exception.SqlConstraintException;
import com.shosha.springboot.demo.model.dto.AddressDto;
import com.shosha.springboot.demo.model.dto.InstructorDto;
import com.shosha.springboot.demo.model.entity.Instructor;
import com.shosha.springboot.demo.util.transformation.InstructorTransformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<InstructorDto> findAll() {
        List<Instructor> instructors = instructorRepository.findAll();
        return instructors.stream().map(InstructorTransformation::transformToInstructorDto).toList();
    }

    @Override
    public List<InstructorDto> findAllByFirstName(String firstName) {
        List<Instructor> instructors = instructorRepository.findAllByFirstName(firstName);
        return instructors.stream().map(InstructorTransformation::transformToInstructorDto).toList();
    }

    @Override
    public Instructor findById(String id) {
        Optional<Instructor> instructor = instructorRepository.findById(id);
        if (!instructor.isPresent()) {
            throw new InstructorNotFoundException("Instructor not found with id : " + id);
        } else {
            return instructor.get();
        }
    }

    @Override
    public InstructorDto getInstructorDtoById(String id) throws InstructorNotFoundException {
        return InstructorTransformation.transformToInstructorDto(findById(id));
    }

    @Override
    public String findIdByEmail(String email) throws InstructorNotFoundException {
        return instructorRepository.getIdByEmail(email);
    }

    @Override
    public String findCourseCodeByEmail(String email) throws InstructorNotFoundException {
        return instructorRepository.getCourseCodeByEmail(email);
    }

    @Override
    public Optional<Instructor> findInstructorByEmail(String email) throws InstructorNotFoundException {
        Optional<Instructor> instructor = instructorRepository.findByEmail(email);
        if (!instructor.isPresent()) {
            throw new InstructorNotFoundException("Instructor not found with email : " + email);
        } else {
            return instructor;
        }
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
            throw new SqlConstraintException("Duplicate data entry doesn't allowed");
        }
        instructorRepository.save(instructor);
    }


    @Override
    public void update(InstructorDto instructorDto, String id) throws InstructorNotFoundException {
        Optional<Instructor> instructor = instructorRepository.findById(id);
        if (instructor.isPresent()) {
            Instructor updatedInstructor = instructor.get();
            updatedInstructor.setFirstName(instructorDto.getFirstName());
            updatedInstructor.setLastName(instructorDto.getLastName());
            updatedInstructor.setEmail(instructorDto.getEmail());
            updatedInstructor.setBirthDate(instructorDto.getBirthDate());
            updatedInstructor.setAddress(updatedInstructor.getAddress());
            updatedInstructor.setCourse(updatedInstructor.getCourse());
            instructorRepository.save(updatedInstructor);
        } else {
            throw new InstructorNotFoundException("Instructor not found with id : " + id);
        }

    }

    @Override
    public void delete(String id) throws InstructorNotFoundException {
        Optional<Instructor> instructor = instructorRepository.findById(id);
        if (instructor.isPresent()) {
            instructorRepository.delete(instructor.get());
        } else {
            throw new InstructorNotFoundException("Instructor not found with id : " + id);
        }

    }

    @Override
    public AddressDto findAddressByEmail(String email) throws InstructorNotFoundException {
        Optional<Instructor> instructor = instructorRepository.findByEmail(email);
        if (!instructor.isPresent()) {
            throw new InstructorNotFoundException("Instructor not found with email : " + email);
        }
        return InstructorTransformation.transformToInstructorDto(instructor.get()).getAddress();
    }


}
