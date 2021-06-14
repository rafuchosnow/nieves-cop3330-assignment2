/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordCreatorTest {

    @Test
    void passwordValidator_less_than_8_numbers() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("12345");
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_less_than_8_letters() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("abide");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_less_than_8_letters_and_numbers() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("abi1561");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_weak_8_or_more_numbers() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("123456789");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_weak_8_or_more_letters() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("AbCdEfGdAs");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_more_than_8_letter_and_numbers() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("12345aBcDe");
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_more_than_8_letter_numbers_and_special() {
        passwordCreator pC = new passwordCreator();

        int actual = pC.passwordValidator("12345aBcDe$@");
        int expected = 3;

        assertEquals(expected, actual);
    }

}