/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void PaymentCalculator_example() {
        PaymentCalculator PC = new PaymentCalculator();

        double actual = PC.calculateMonthsUntilPaidOff(5000, 12, 100);
        double expected = 70;

        assertEquals(expected, actual);
    }

    @Test
    void PaymentCalculator_high_balance() {
        PaymentCalculator PC = new PaymentCalculator();

        double actual = PC.calculateMonthsUntilPaidOff(35000, 3.5, 1800);
        double expected = 21;

        assertEquals(expected, actual);
    }

    @Test
    void PaymentCalculator_small_balance() {
        PaymentCalculator PC = new PaymentCalculator();

        double actual = PC.calculateMonthsUntilPaidOff(1000, 35, 40);
        double expected = 46;

        assertEquals(expected, actual);
    }

    @Test
    void PaymentCalculator_decimals() {
        PaymentCalculator PC = new PaymentCalculator();

        double actual = PC.calculateMonthsUntilPaidOff(1325.98425, 13.69, 59.420);
        double expected = 26;

        assertEquals(expected, actual);
    }

    @Test
    void PaymentCalculator_decimals_only() {
        PaymentCalculator PC = new PaymentCalculator();

        double actual = PC.calculateMonthsUntilPaidOff(.420, .69, 0.010);
        double expected = 43;

        assertEquals(expected, actual);
    }


}