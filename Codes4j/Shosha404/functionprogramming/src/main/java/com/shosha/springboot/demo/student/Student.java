package com.shosha.springboot.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a student with personal details such as first name, last name, age, and email.
 * The {@code @Data} annotation generates getters and setters for all fields, a toString method, hashCode,
 * and equals methods.
 * The {@code @NoArgsConstructor} annotation generates a no-argument constructor.
 * The {@code @AllArgsConstructor} annotation generates a constructor with all fields as parameters.
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
