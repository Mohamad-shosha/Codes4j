package com.shosha.springboot.demo.error;

import com.shosha.springboot.demo.error.body.ErrorBody;
import com.shosha.springboot.demo.error.exception.InstructorNotFoundException;
import com.shosha.springboot.demo.error.exception.SqlConstraintException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SqlConstraintException.class)
    public ResponseEntity<ErrorBody> handleSqlConstraintException(SqlConstraintException sqlConstraintException) {
        ErrorBody errorBody = new ErrorBody(sqlConstraintException.getCode(),
                sqlConstraintException.getErrorMassage(),
                sqlConstraintException.getDescription(),
                sqlConstraintException.getTimestamp());
        return new ResponseEntity<>(errorBody, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(InstructorNotFoundException.class)
    public ResponseEntity<ErrorBody> handleInstructorNotFoundException(InstructorNotFoundException instructorNotFoundException) {
        ErrorBody errorBody = new ErrorBody(instructorNotFoundException.code,
                instructorNotFoundException.message,
                instructorNotFoundException.description,
                instructorNotFoundException.getTimestamp()
                );
        return new ResponseEntity<>(errorBody, HttpStatus.NOT_FOUND);
    }
}
