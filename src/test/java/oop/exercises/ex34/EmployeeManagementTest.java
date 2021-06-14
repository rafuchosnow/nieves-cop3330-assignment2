/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex34;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagementTest {

    @Test
    void printList() {
        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        EmployeeManagement EM = new EmployeeManagement();

        String actual = EM.printList(Employees);
        String expected = "\n" +
                "There are 5 employees: \n" +
                "John Smith\n" +
                "Jackie Jackson\n" +
                "Chris Jones\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin\n";

        assertEquals(expected, actual);
    }

    @Test
    void printList_numbers() {
        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("420", "69", "18", "21", "69420"));

        EmployeeManagement EM = new EmployeeManagement();

        String actual = EM.printList(Employees);
        String expected = "\n" +
                "There are 5 employees: \n" +
                "420\n" +
                "69\n" +
                "18\n" +
                "21\n" +
                "69420\n";

        assertEquals(expected, actual);
    }

    @Test
    void printList_special() {
        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("!@#", "$#", "@!#", "%^", "**^%"));

        EmployeeManagement EM = new EmployeeManagement();

        String actual = EM.printList(Employees);
        String expected = "\n" +
                "There are 5 employees: \n" +
                "!@#\n" +
                "$#\n" +
                "@!#\n" +
                "%^\n" +
                "**^%\n";

        assertEquals(expected, actual);
    }

    //unable to test remove function since no String is returned due to working with list
}