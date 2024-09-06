package com.shosha.springboot.demo.error.exception;

import com.shosha.springboot.demo.util.time.CurrentTimeStamp;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Value
public class SqlConstraintException extends SQLIntegrityConstraintViolationException {
    public Integer code = 404;
    public String errorMassage = "SQL Constraint Exception";
    public String description;
    public Timestamp timestamp;

    public SqlConstraintException(String message) {
        this.description = message;
        this.timestamp = CurrentTimeStamp.timestamp();
    }

}
