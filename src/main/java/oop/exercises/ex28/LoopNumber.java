/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex28;

import java.util.Scanner;

public class LoopNumber {
    private static final Scanner input = new Scanner(System.in);

    public static double numberType(double j, double sum) {

        for (int i = 1; i <= j; i++) {
            System.out.print("Enter a number: ");
            sum += input.nextDouble();
        }

        return sum;
    }
}

