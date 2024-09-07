package com.shosha.springboot.demo.dao.courserepository;

import com.shosha.springboot.demo.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {
    boolean existsByNameAndCode(String name, String code);
}
