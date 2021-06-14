/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @Test
    void calculateRate() {
        new HeartRate();

        String actual = HeartRate.calculateRate(65,22);
        String expected = "Resting pulse: 65     Age: 22\n" +
                "Intensity   | Rate \n" +
                "-----------------------\n" +
                "55%         | 138 bpm\n" +
                "60%         | 145 bpm\n" +
                "65%         | 151 bpm\n" +
                "70%         | 158 bpm\n" +
                "75%         | 165 bpm\n" +
                "80%         | 171 bpm\n" +
                "85%         | 178 bpm\n" +
                "90%         | 185 bpm\n";

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_decimals() {
        new HeartRate();

        String actual = HeartRate.calculateRate(69.420,18);
        String expected = "Resting pulse: 69     Age: 18\n" +
                "Intensity   | Rate \n" +
                "-----------------------\n" +
                "55%         | 142 bpm\n" +
                "60%         | 149 bpm\n" +
                "65%         | 156 bpm\n" +
                "70%         | 162 bpm\n" +
                "75%         | 169 bpm\n" +
                "80%         | 175 bpm\n" +
                "85%         | 182 bpm\n" +
                "90%         | 189 bpm\n";

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_decimals_only() {
        new HeartRate();

        String actual = HeartRate.calculateRate(0.42,0.05);
        String expected = "Resting pulse: 0     Age: 0\n" +
                "Intensity   | Rate \n" +
                "-----------------------\n" +
                "55%         | 121 bpm\n" +
                "60%         | 132 bpm\n" +
                "65%         | 143 bpm\n" +
                "70%         | 154 bpm\n" +
                "75%         | 165 bpm\n" +
                "80%         | 176 bpm\n" +
                "85%         | 187 bpm\n" +
                "90%         | 198 bpm\n";

        assertEquals(expected, actual);
    }

    @Test
    void calculateRate_large_number() {
        new HeartRate();

        String actual = HeartRate.calculateRate(200,150);
        String expected = "Resting pulse: 200     Age: 150\n" +
                "Intensity   | Rate \n" +
                "-----------------------\n" +
                "55%         | 128 bpm\n" +
                "60%         | 122 bpm\n" +
                "65%         | 115 bpm\n" +
                "70%         | 109 bpm\n" +
                "75%         | 102 bpm\n" +
                "80%         | 96 bpm\n" +
                "85%         | 89 bpm\n" +
                "90%         | 83 bpm\n";

        assertEquals(expected, actual);
    }
}