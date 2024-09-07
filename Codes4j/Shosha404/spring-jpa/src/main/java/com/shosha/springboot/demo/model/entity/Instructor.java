package com.shosha.springboot.demo.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@Table(name = "instructors")
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    @Id
    @Column(name = "instructor_id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private String birthDate;

    private String email;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "course_id")
    private String courseId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    private Course course;

}
