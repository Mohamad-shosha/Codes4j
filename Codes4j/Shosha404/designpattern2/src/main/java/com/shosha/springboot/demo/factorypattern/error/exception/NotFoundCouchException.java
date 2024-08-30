package com.shosha.springboot.demo.factorypattern.error.exception;

import com.shosha.springboot.demo.factorypattern.util.CurrentTimeStamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
public class NotFoundCouchException extends NullPointerException {
    private final Integer code = 97458;
    private final String message = "couch exception";
    private String detail;
    private String timestamp;

    public NotFoundCouchException(String detail) {
        this.detail = detail;
        this.timestamp = CurrentTimeStamp.getCurrentTimeStamp().toString();
    }

}
