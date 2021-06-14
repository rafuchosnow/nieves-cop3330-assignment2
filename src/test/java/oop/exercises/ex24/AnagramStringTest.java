/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramStringTest {

    @Test
    void isAnagram_returns_true() {

        AnagramString as = new AnagramString();

        boolean actual = as.isAnagram("race", "care");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_with_numbers() {

        AnagramString as = new AnagramString();

        boolean actual = as.isAnagram("race156", "1ca6re5");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_with_sentence() {

        AnagramString as = new AnagramString();

        boolean actual = as.isAnagram("ToM MarVolO RIDDLE", "I am Lord Voldemort");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false() {

        AnagramString as = new AnagramString();

        boolean actual = as.isAnagram("race", "clown");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_with_sentence() {

        AnagramString as = new AnagramString();

        boolean actual = as.isAnagram("I love Doritos", "I love Ruffles");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_same_length() {

        AnagramString as = new AnagramString();

        boolean actual = as.isAnagram("goat", "road");
        boolean expected = false;

        assertEquals(expected, actual);
    }


}