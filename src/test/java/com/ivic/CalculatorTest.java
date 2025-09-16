package com.ivic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void canAddTwoNumbers() {
        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 20;
        int result = underTest.add(number1, number2);
        assertEquals(30, result);
    }

    @Test
    void canAddNegativeNumbers() {
        Calculator underTest = new Calculator();
        int number1 = -10;
        int number2 = -20;
        int result = underTest.add(number1, number2);
        assertEquals(-30, result);
    }

    @Test
    void canHandleWhenInputIsZero() {
        Calculator underTest = new Calculator();
        int result = underTest.add(0);
        assertEquals(0, result);
    }

    @Test
    void canAddNumbersFromgivenArray() {
        Calculator underTest = new Calculator();
        var numbers = new int[]{1, 3, 5};
        var result = underTest.add(numbers);
        assertEquals(9, result);
    }

}
 