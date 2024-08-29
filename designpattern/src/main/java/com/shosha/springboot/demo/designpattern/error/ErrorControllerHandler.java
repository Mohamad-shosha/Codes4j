package com.shosha.springboot.demo.designpattern.error;

import com.shosha.springboot.demo.designpattern.error.errorbody.ResponseError;
import com.shosha.springboot.demo.designpattern.error.exception.CouchNotFoundException;
import com.shosha.springboot.demo.designpattern.error.exception.IsEmpty;
import com.shosha.springboot.demo.designpattern.error.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorControllerHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ResponseError> runTimeExceptionHandler(StudentNotFoundException exception) {
        ResponseError responseError = new ResponseError(exception.getErrorCode(),
                exception.getErrorMassage(),
                exception.getErrorDescription(),
                exception.getCurrentTimestamp());
        return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IsEmpty.class)
    public ResponseEntity<ResponseError> runTimeExceptionHandler(IsEmpty exception) {
        ResponseError responseError = new ResponseError(exception.getCode(),
                exception.getMessage(),
                exception.getDescription(),
                exception.getCurrentTime());
        return new ResponseEntity<>(responseError, HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(CouchNotFoundException.class)
    public ResponseEntity<ResponseError> runTimeExceptionHandler(CouchNotFoundException exception) {
        ResponseError responseError = new ResponseError(exception.getErrorCode(),
                exception.getErrorMassage(),
                exception.getErrorDescription(),
                exception.getCurrentTimestamp());
        return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);
    }
}
