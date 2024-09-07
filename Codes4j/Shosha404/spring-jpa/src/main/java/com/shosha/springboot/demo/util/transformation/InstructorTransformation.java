package com.shosha.springboot.demo.util.transformation;

import com.shosha.springboot.demo.model.dto.InstructorDto;
import com.shosha.springboot.demo.model.entity.Address;
import com.shosha.springboot.demo.model.entity.Course;
import com.shosha.springboot.demo.model.entity.Instructor;
import com.shosha.springboot.demo.util.randomids.RandomValues;

public class InstructorTransformation {

    private InstructorTransformation() {

    }

    public static InstructorDto transformToInstructorDto(Instructor instructor) {
        InstructorDto.InstructorDtoBuilder builder = InstructorDto.builder();
        builder.firstName(instructor.getFirstName())
                .lastName(instructor.getLastName())
                .email(instructor.getEmail())
                .birthDate(instructor.getBirthDate())
                .address(AddressTransformation.transformToAddressDto(instructor.getAddress()))
                .course(CourseTransformation.transformToCourseDto(instructor.getCourse()));
        return builder.build();
    }

    public static Instructor transformToStudent(InstructorDto instructorDto) {
        Instructor.InstructorBuilder instructorBuilder = Instructor.builder();
        instructorBuilder.id(RandomValues.randomNumbersForId())
                .firstName(instructorDto.getFirstName())
                .lastName(instructorDto.getLastName())
                .email(instructorDto.getEmail())
                .birthDate(instructorDto.getBirthDate());
        if (instructorDto.getAddress() != null) {
            Address address = AddressTransformation.transformToAddress(instructorDto.getAddress());
            instructorBuilder.addressId(address.getId());
            instructorBuilder.address(address);
        }
        if (instructorDto.getCourse() != null) {
            Course course = CourseTransformation.transformToCourse(instructorDto.getCourse());
            instructorBuilder.courseId(course.getId());
            instructorBuilder.course(course);
        }
        return instructorBuilder.build();
    }
}
