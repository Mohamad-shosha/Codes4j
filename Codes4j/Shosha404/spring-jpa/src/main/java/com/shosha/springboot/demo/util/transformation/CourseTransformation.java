package com.shosha.springboot.demo.util.transformation;

import com.shosha.springboot.demo.model.dto.CourseDto;
import com.shosha.springboot.demo.model.entity.Course;
import com.shosha.springboot.demo.util.randomids.RandomValues;

public class CourseTransformation {

    private CourseTransformation() {

    }

    public static CourseDto transformToCourseDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setName(course.getName());
        courseDto.setCode(course.getCode());
        courseDto.setDescription(course.getDescription());
        return courseDto;
    }

    public static Course transformToCourse(CourseDto courseDto) {
        Course course = new Course();
        course.setId(RandomValues.randomNumbersForId());
        course.setName(courseDto.getName());
        course.setCode(courseDto.getCode());
        course.setDescription(courseDto.getDescription());
        return course;
    }
}
