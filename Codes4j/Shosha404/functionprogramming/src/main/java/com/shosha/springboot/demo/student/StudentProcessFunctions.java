package com.shosha.springboot.demo.student;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StudentProcessFunctions {
    public static String getStudentFullName (BiFunction<String,String,String> function ,
                                             String firstName, String lastName) {
        return function.apply(firstName, lastName);
    }
    public static String getStudentEmail(Function<Student,String> function , Student student) {
        return function.apply(student);
    }
}
