/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex25;

import java.util.Scanner;

public class ex25 {
    private static final Scanner input = new Scanner(System.in);

    private static String password;

    public static void main(String[] args) {

        userString();

        passwordCreator pC = new passwordCreator();
        int result = pC.passwordValidator(password);

        String finalOutput = outputString(result);

        System.out.println(finalOutput);
    }

    public static void userString() {
        System.out.println("Please create a password up next. Make sure to use a strong password: ");

        System.out.print("Set your password: ");
        password = input.nextLine();
    }

    public static String outputString(int passwordValidator) {
        if (passwordValidator == 0){
            return "The password '" + password + "' is a very weak password.\n";
        }
        else if (passwordValidator == 1){
            return "The password '" + password + "' is a weak password.\n";
        }
        else if (passwordValidator == 2){
            return "The password '" + password + "' is a strong password.\n";
        }
        else if (passwordValidator == 3){
            return "The password '" + password + "' is a very strong password.\n";
        }
        return null;
    }
}
