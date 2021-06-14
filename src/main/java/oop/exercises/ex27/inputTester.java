/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex27;

public class inputTester {

    public String validateInput(String firstName, String lastName, String ZIP, String employeeID) {

        new ex27();

        String outputString = "";

        outputString += ex27.validateFirstLength(firstName);
        outputString += ex27.validateFirstFilled(firstName);

        outputString += ex27.validateLastLength(lastName);
        outputString += ex27.validateLastFilled(lastName);

        outputString += ex27.validateZIP(ZIP);

        outputString += ex27.validateID(employeeID);

        outputString += ex27.validateAllErrors(outputString);

        return outputString;
    }
}
