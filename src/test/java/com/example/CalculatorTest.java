package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest 
{
    @Test
    void twoPlusTwo() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    void twoMinusTwo() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    void twoByFive() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    void tenDividedByTwo() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void twoPowerThree() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.power(2, 3));
    }
}
