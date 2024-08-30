package com.shosha.springboot.demo.factorypattern.util;

import java.sql.Timestamp;

public class CurrentTimeStamp {
    public static Timestamp getCurrentTimeStamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
