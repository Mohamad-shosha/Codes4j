package com.shosha.springboot.demo.unitfunctions;

public class UnitFunctions {
    public static Integer checkNumber(int number) {
        if (number < 0) {
            throw new NumberFormatException();
        } else {
            return number;
        }
    }
    public static String checkTimeOut() throws InterruptedException {
        Thread.sleep(2000);
        return "He is sleep now";
    }
}
