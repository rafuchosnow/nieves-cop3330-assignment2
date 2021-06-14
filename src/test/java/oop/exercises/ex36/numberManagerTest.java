/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import java.util.ArrayList;

class numberManagerTest {

    @Test
    void findAverage() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("100", "200", "1000", "300"));

        numberManager EM = new numberManager();

        String actual = EM.findAverage(Numbers);
        String expected = "\n" +
                "The average is 400.0\n";

        assertEquals(expected, actual);
    }

    @Test
    void findMinimum() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("100", "200", "1000", "300"));

        numberManager EM = new numberManager();

        String actual = EM.findMinimum(Numbers);
        String expected = "The minimum is 100.0\n";

        assertEquals(expected, actual);
    }

    @Test
    void findMaximum() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("100", "200", "1000", "300"));

        numberManager EM = new numberManager();

        String actual = EM.findMaximum(Numbers);
        String expected = "The maximum is 1000.0\n";

        assertEquals(expected, actual);
    }

    @Test
    void findSTDdev() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("100", "200", "1000", "300"));

        numberManager EM = new numberManager();

        String actual = EM.findSTDdev(Numbers);
        String expected = "The standard deviation is 353.55";

        assertEquals(expected, actual);
    }

    @Test
    void findAverage_large() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("654151", "42069", "5111", "8206"));

        numberManager EM = new numberManager();

        String actual = EM.findAverage(Numbers);
        String expected = "\n" +
                "The average is 177384.25\n";

        assertEquals(expected, actual);
    }

    @Test
    void findMinimum_decimals() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("654151", "42069", "5111", "8206"));

        numberManager EM = new numberManager();

        String actual = EM.findMinimum(Numbers);
        String expected = "The minimum is 5111.0\n";

        assertEquals(expected, actual);
    }

    @Test
    void findMaximum_decimals() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("654151", "42069", "5111", "8206"));

        numberManager EM = new numberManager();

        String actual = EM.findMaximum(Numbers);
        String expected = "The maximum is 654151.0\n";

        assertEquals(expected, actual);
    }

    @Test
    void findSTDdev_decimals() {
        ArrayList<String> Numbers = new ArrayList<String>
                (Arrays.asList("654151", "42069", "5111", "8206"));

        numberManager EM = new numberManager();

        String actual = EM.findSTDdev(Numbers);
        String expected = "The standard deviation is 275642.93";

        assertEquals(expected, actual);
    }
}