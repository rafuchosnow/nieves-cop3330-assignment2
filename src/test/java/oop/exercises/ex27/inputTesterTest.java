/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputTesterTest {

    @Test
    void validateInput_no_errors() {
        inputTester IT = new inputTester();

        String actual = IT.validateInput("Rafael", "Snow", "69420","RN-4321");
        String expected = "There were no errors found.\n";

        assertEquals(expected, actual);
    }

    @Test
    void validateInput_wrong_names() {
        inputTester IT = new inputTester();

        String actual = IT.validateInput("R", "", "69420","RN-4321");
        String expected = "The first name must be at least 2 characters long.\n" +
                          "The last name must be at least 2 characters long.\n" +
                          "The last name must be filled in.\n";

        assertEquals(expected, actual);
    }

    @Test
    void validateInput_wrong_ZIP() {
        inputTester IT = new inputTester();

        String actual = IT.validateInput("Rafael", "Snow", "1234","RN-4321");
        String expected = "The zipcode must be a 5 digit number.\n";

        assertEquals(expected, actual);
    }

    @Test
    void validateInput_wrong_ID() {
        inputTester IT = new inputTester();

        String actual = IT.validateInput("Rafael", "Snow", "69420","B69-42069");
        String expected = "The employee ID must be in the format of AA-1234.\n";

        assertEquals(expected, actual);
    }

    @Test
    void validateInput_no_input() {
        inputTester IT = new inputTester();

        String actual = IT.validateInput("", "", "","");
        String expected = "The first name must be at least 2 characters long.\n" +
                          "The first name must be filled in.\n" +
                          "The last name must be at least 2 characters long.\n" +
                          "The last name must be filled in.\n" +
                          "The zipcode must be a 5 digit number.\n" +
                          "The employee ID must be in the format of AA-1234.\n";

        assertEquals(expected, actual);
    }

    @Test
    void validateInput_all_wrong() {
        inputTester IT = new inputTester();

        String actual = IT.validateInput("", "S", "ABCDE","GC+6464");
        String expected = "The first name must be at least 2 characters long.\n" +
                "The first name must be filled in.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The zipcode must be a 5 digit number.\n" +
                "The employee ID must be in the format of AA-1234.\n";

        assertEquals(expected, actual);
    }
}