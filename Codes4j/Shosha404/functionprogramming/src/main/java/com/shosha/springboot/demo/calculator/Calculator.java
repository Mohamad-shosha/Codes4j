package com.shosha.springboot.demo.calculator;

public class Calculator {
    public static Integer add(Integer numberOne, Integer numberTwo) {
        return numberOne + numberTwo;
    }

    public static Integer subtract(Integer numberOne, Integer numberTwo) {
        return numberOne - numberTwo;
    }

    public static Integer multiply(Integer numberOne, Integer numberTwo) {
        return numberOne * numberTwo;
    }

    public static Float divide(Integer numberOne, Integer numberTwo) {
        return ((float) numberOne / (float) numberTwo);
    }

    public static Integer multiplicationByTwo(Integer numberOne) {
        return numberOne * 2;
    }

    public static Integer addOne(Integer numberOne) {
        return numberOne + 1;
    }

    public static Integer subtractOne(Integer numberOne) {
        return numberOne - 1;
    }
}
