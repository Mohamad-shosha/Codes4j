package com.shosha.springboot.demo.calculatortest;

import com.shosha.springboot.demo.calculator.Calculator;
import org.junit.jupiter.api.*;

import static com.shosha.springboot.demo.calculator.Calculator.*;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class CalculatorTest {

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class\n");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each test, create instance of Calculator");
        Calculator calculator = new Calculator();
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test is done successfully\n");
    }

    @Test
    public void testAddition() {
        System.out.println("Running equals and not equals method");
        Integer result = 20;
        Assertions.assertEquals(result, add(15, 5), "result must be 20");
        Assertions.assertNotEquals(result, add(1, 5), "result must be 20");
    }

    @Test
    public void testSubtraction() {
        System.out.println("Running equals and not equals method");
        Integer result = 10;
        Assertions.assertEquals(result,subtract(15, 5), "result must be 20");
        Assertions.assertNotEquals(result, subtract(1, 5), "result must be 20");
    }

    @Test
    public void testMultiplication() {
        System.out.println("Running equals and not equals method");
        Integer result = 20;
        Assertions.assertEquals(result,multiply(2,10), "result must be 20");
    }

    @Test
    public void testDivision() {
        System.out.println("Running equals and not equals method");
        Float result = 5f;
        Assertions.assertEquals(result,divide(10,2), "result must be 20");
    }

}
