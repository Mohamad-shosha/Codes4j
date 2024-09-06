package com.shosha.springboot.demo.designpattern.util;

import java.sql.Timestamp;

public class TimingUtilities {
    private TimingUtilities() {

    }

    public static Timestamp timestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
