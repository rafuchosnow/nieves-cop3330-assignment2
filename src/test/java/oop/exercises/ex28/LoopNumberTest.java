/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopNumberTest {

    @Test
    void numberType_1_numbers() {
        new LoopNumber();

        double actual = LoopNumber.numberType(5,0);
        double expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void numberType_10_numbers() {
        new LoopNumber();

        double actual = LoopNumber.numberType(5,0);
        double expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void numberType_15_numbers() {
        new LoopNumber();

        double actual = LoopNumber.numberType(5,0);
        double expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void numberType_100_numbers() {
        new LoopNumber();

        double actual = LoopNumber.numberType(5,0);
        double expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void numberType_MAX_numbers() {
        new LoopNumber();

        double actual = LoopNumber.numberType(5,0);
        double expected = 0;

        assertEquals(expected, actual);
    }
}