/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex34 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        EmployeeManagement EM = new EmployeeManagement();

        ArrayList<String> Employees = new ArrayList<String>
                (Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        String outputString = (String) EM.printList(Employees);
        System.out.println(outputString);

        EM.removeList(Employees);

        outputString = (String) EM.printList(Employees);
        System.out.println(outputString);
    }
}
