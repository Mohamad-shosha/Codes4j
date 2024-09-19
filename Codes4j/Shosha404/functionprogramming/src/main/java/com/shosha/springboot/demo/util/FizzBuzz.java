package com.shosha.springboot.demo.util;

public class FizzBuzz {

    private FizzBuzz() {
    }

    public static String calculateFizzbazz(int fizzbuzzNumber) {
        if (fizzbuzzNumber % 3 == 0 && fizzbuzzNumber % 5 == 0) {
            return "Fizzbuzz";
        } else if (fizzbuzzNumber % 3 == 0) {
            return "Fizz";
        } else if (fizzbuzzNumber % 5 == 0) {
            return "buzz";
        } else return "null";
    }
}
