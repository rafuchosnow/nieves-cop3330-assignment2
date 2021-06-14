/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleOf72Test {

    @Test
    void calculateYears_example() {
        new RuleOf72();

        double actual = RuleOf72.calculateYears("4");
        double expected = 18;

        assertEquals(expected, actual);
    }

    @Test
    void calculateYears_decimals() {
        new RuleOf72();

        double actual = RuleOf72.calculateYears("1.5");
        double expected = 48;

        assertEquals(expected, actual);
    }

    @Test
    void calculateYears_Large_Numbers() {
        new RuleOf72();

        double actual = RuleOf72.calculateYears("300000");
        double expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void calculateYears_decimals_only() {
        new RuleOf72();

        double actual = RuleOf72.calculateYears("0.420");
        double expected = 172;

        assertEquals(expected, actual);
    }



    //@Test Unable to generate output since LoopRate would loop forever
    void calculateYears_with_0() {
        new RuleOf72();

        double actual = RuleOf72.calculateYears("0");
        double expected = 0;

        assertEquals(expected, actual);
    }

    //@Test Unable to generate output since LoopRate would loop forever
    void calculateYears_with_letters() {
        new RuleOf72();

        double actual = RuleOf72.calculateYears("abc");
        double expected = 0;

        assertEquals(expected, actual);
    }
}