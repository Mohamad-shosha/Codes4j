package com.shosha.springboot.demo.designpattern.error.errorbody;


import java.sql.Timestamp;

public record ResponseError(int code, String massage, String description, Timestamp currentTime) {
}
