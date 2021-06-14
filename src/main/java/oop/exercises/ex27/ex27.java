/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex27;

import java.util.Scanner;

public class ex27 {
    private static final Scanner input = new Scanner(System.in);

    private static String firstName;
    private static String lastName;
    private static String ZIP;
    private static String employeeID;


    public static void main(String[] args) {

        userString();

        inputTester IT = new inputTester();
        String finalOutput = IT.validateInput(firstName, lastName, ZIP, employeeID);

        System.out.println(finalOutput);

    }

    public static void userString() {
        System.out.print("Enter the first name: ");
        firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        lastName = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        ZIP = input.nextLine();

        System.out.print("Enter the employee ID: ");
        employeeID = input.nextLine();
    }

    public static String validateFirstLength(String firstName){
        if (firstName.length() <= 2){
            return "The first name must be at least 2 characters long.\n";
        }
        else {
            return "";
        }
    }

    public static String validateFirstFilled(String firstName){
        if (firstName.equals("")){
            return "The first name must be filled in.\n";
        }
        else {
            return "";
        }
    }

    public static String validateLastLength(String firstName){
        if (firstName.length() <= 2){
            return "The last name must be at least 2 characters long.\n";
        }
        else {
            return "";
        }
    }

    public static String validateLastFilled(String firstName){
        if (firstName.equals("")){
            return "The last name must be filled in.\n";
        }
        else {
            return "";
        }
    }

    public static String validateZIP(String ZIP) {
        if (ZIP.matches("[0-9]{5}")) {
            return "";
        }
        else {
            return "The zipcode must be a 5 digit number.\n";
        }
    }

    public static String validateID(String employeeID) {
        if (employeeID.matches("[a-zA-Z]{2}[-][0-9]{4}")) {
            return "";
        }
        else {
            return "The employee ID must be in the format of AA-1234.\n";
        }
    }

    public static String validateAllErrors(String outputString) {
        if (outputString.equals("")) {
            return "There were no errors found.\n";
        }
        else{
            return "";
        }
    }



}
