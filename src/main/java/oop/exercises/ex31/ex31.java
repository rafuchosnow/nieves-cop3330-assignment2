/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex31;

import java.util.Scanner;

public class ex31 {
    private static final Scanner input = new Scanner(System.in);

    private static double restingHR = 0;
    private static double age = 0;


    public static void main(String[] args) {

        userString();

        HeartRate HR = new HeartRate();
        String finalOutput = HR.calculateRate(restingHR, age);

        System.out.println(finalOutput);
    }

    public static void userString() {

        String ageString;
        String restingString;

        while (true) {
            System.out.print("Enter your resting pulse: ");
            restingString = input.nextLine();

            System.out.print("Enter your age: ");
            ageString = input.nextLine();

            try {
                restingHR = Double.parseDouble(restingString);
                age = Double.parseDouble(ageString);
                break;

            } catch (NumberFormatException ex) {

                System.out.println("Please enter numerical values only. Try again.\n");
            }
        }
        restingHR = Double.parseDouble(restingString);
        age = Double.parseDouble(ageString);
    }
}
