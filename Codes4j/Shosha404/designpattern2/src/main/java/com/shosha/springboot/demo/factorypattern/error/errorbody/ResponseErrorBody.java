package com.shosha.springboot.demo.factorypattern.error.errorbody;

import java.security.Timestamp;

public record ResponseErrorBody(Integer code, String message, String detail, String timestamp) {

}
