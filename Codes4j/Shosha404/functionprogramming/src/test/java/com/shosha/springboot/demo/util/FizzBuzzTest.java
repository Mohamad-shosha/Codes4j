package com.shosha.springboot.demo.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class FizzBuzzTest {

    @Test
    @Order(1)
    @DisplayName("Test Divisible By 3")
    public void testDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.calculateFizzbazz(3), "Expected fizz in output");
    }

    @Test
    @Order(2)
    @DisplayName("Test Divisible By 5")
    public void testDivisibleByFive() {
        assertEquals("buzz", FizzBuzz.calculateFizzbazz(5), "Expected buzz in output");
    }

    @Test
    @Order(3)
    @DisplayName("Test Divisible By 3 & 5")
    public void testDivisibleByThreeAndFive() {
        assertEquals("Fizzbuzz", FizzBuzz.calculateFizzbazz(15), "Expected Fizzbuzz in output");
    }

    @Test
    @Order(4)
    @DisplayName("Test Not Divisible By 3 or 5")
    public void testNotDivisibleByThreeAndFive() {
        assertNotEquals("1", FizzBuzz.calculateFizzbazz(1), "Expected number1 in output");
    }
}
