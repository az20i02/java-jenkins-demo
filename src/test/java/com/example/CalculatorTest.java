package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for Calculator.
 */
public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        // WRONG expected value on purpose:
        assertEquals(6, calc.add(2, 3));
    }


    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }
}

