package com.shosha.springboot.demo.error.exception;

import com.shosha.springboot.demo.util.time.CurrentTimeStamp;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Value
public class InstructorNotFoundException extends RuntimeException {
    public Integer code = 657;
    public String message = "Instructor not found";
    public String description;
    public Timestamp timestamp;

    public InstructorNotFoundException(String message) {
        this.description = message;
        this.timestamp = CurrentTimeStamp.timestamp();
    }
}
