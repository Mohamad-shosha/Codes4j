package com.shosha.springboot.demo.util;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.shosha.springboot.demo.util.UnitFunctions.checkNumber;
import static com.shosha.springboot.demo.util.UnitFunctions.checkTimeOut;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class UnitFunctionsTest {
    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class\n");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("@AfterAll executes only once after all test methods execution\n");
    }

    @BeforeEach
    public void setUp() {
        UnitFunctions unitFunctions = new UnitFunctions();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("@AfterEach executes only once after all test methods execution");
    }

    @Test
    @Order(2)
    @DisplayName("Value Check Test")
    public void checkValueTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            checkNumber(-5);
        }, "The number must be larger than zero");
        Assertions.assertDoesNotThrow(() -> {
            checkNumber(5);
        }, "The number larger than zero");
    }

    @Test
    @Order(1)
    @DisplayName("Check Time Test")
    public void checkTimeOutTest() {
        Assertions.assertTimeout(Duration.ofMillis(5000), () -> {
            checkTimeOut();
        });
    }

}
