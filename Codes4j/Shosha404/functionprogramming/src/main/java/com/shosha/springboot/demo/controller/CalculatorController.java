package com.shosha.springboot.demo.controller;

import com.shosha.springboot.demo.calculator.Calculator;
import com.shosha.springboot.demo.calculator.ProcessFunctions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CalculatorController {

    @GetMapping("Add/{numberOne}/{numberTwo}")
    public void addTwoNumbers(@PathVariable Integer numberOne, @PathVariable Integer numberTwo) {
        Integer resultOfAdding = ProcessFunctions.processTwoIntegersOfInput(Calculator::add,
                numberOne, numberTwo);

        log.info("The result of adding is : {} ", resultOfAdding);

    }

    @GetMapping("MultiplyByTwo/{number}")
    public void multiplyByTwo(@PathVariable Integer number) {
        Long resultOfMultiplyByTwo = ProcessFunctions.processOneIntegerInput(Calculator::multiplicationByTwo,
                number);

        log.info("The result of multiply {} by Two is : {} ", number, resultOfMultiplyByTwo);
    }

    @GetMapping("Multiply/{numberOne}/{numberTwo}")
    public void multiply(@PathVariable Integer numberOne, @PathVariable Integer numberTwo) {
        Integer resultOfMultiply = ProcessFunctions.processTwoIntegersOfInput(Calculator::multiply,
                numberOne, numberTwo);

        log.info("The result of multiply {} and {} is : {} ", numberOne, numberTwo, resultOfMultiply);
    }

    @GetMapping("Division/{numberOne}/{numberTwo}")
    public Float Division(@PathVariable Integer numberOne, @PathVariable Integer numberTwo) {
        Float resultOfMultiply = ProcessFunctions.processTwoIntegerInputWithOutputFlout(Calculator::divide,
                numberOne, numberTwo);

        log.info("The result of division {} and {} is : {} ", numberOne, numberTwo, resultOfMultiply);
        return resultOfMultiply;
    }

    @GetMapping("subtract/{numberOne}/{numberTwo}")
    public Integer Subtract(@PathVariable Integer numberOne, @PathVariable Integer numberTwo) {
        Integer resultOfSubtract = ProcessFunctions.processTwoIntegersOfInput(Calculator::subtract,
                numberOne, numberTwo);

        log.info("The result of subtract {} and {} is : {} ", numberOne, numberTwo, resultOfSubtract);
        return resultOfSubtract;
    }





}
