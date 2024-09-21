package com.shosha.springboot.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Represents a student with a first name, last name, age, and email address.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    /**
     * The first name of the student.
     */
    private String firstName;

    /**
     * The last name of the student.
     */
    private String lastName;

    /**
     * The age of the student.
     */
    private int age;

    /**
     * The email address of the student.
     */
    private String email;

    /**
     * @param firstName The first name to be used in the full name.
     * @param lastName  The last name to be used in the full name.
     * @return A {@code String} representing the full name composed of the provided first and last names.
     */
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}
