package com.shosha.springboot.demo.calculator;

import java.util.function.BiFunction;
import java.util.function.IntToLongFunction;

public class ProcessFunctions {
    public static Integer processTwoIntegersOfInput(BiFunction<Integer, Integer, Integer> function,
                                                    Integer numberOne, Integer numberTwo) {
        return function.apply(numberOne, numberTwo);
    }

    public static Long processOneIntegerInput(IntToLongFunction function, Integer number) {
        return function.applyAsLong(number);
    }

    public static Float processTwoIntegerInputWithOutputFlout(BiFunction<Integer, Integer, Float> function,
                                                              Integer numberOne, Integer numberTwo) {
        return function.apply(numberOne, numberTwo);
    }
}
