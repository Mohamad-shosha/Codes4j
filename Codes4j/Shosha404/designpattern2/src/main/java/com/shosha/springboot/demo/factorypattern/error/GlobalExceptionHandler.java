package com.shosha.springboot.demo.factorypattern.error;

import com.shosha.springboot.demo.factorypattern.error.errorbody.ResponseErrorBody;
import com.shosha.springboot.demo.factorypattern.error.exception.NotFoundCouchException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundCouchException.class)
    public ResponseEntity<ResponseErrorBody> noHandlerFoundException(final NotFoundCouchException e) {
        ResponseErrorBody responseErrorBody = new ResponseErrorBody(e.getCode(),e.getMessage(),e.getDetail(),e.getTimestamp());
        return ResponseEntity.ok(responseErrorBody);
    }
}
