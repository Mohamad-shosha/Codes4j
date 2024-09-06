package com.shosha.springboot.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @Column(name = "course_id")
    private String id;

    @Column(name = "course_name", unique = true, nullable = false)
    private String name;

    @Column(name = "course_code")
    private String code;

    private String description;

    @OneToMany(mappedBy = "course")
    private List<Instructor> instructors;
}
