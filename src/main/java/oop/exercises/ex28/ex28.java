/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex28;

import java.util.Scanner;

public class ex28 {
    private static final Scanner input = new Scanner(System.in);

    private static final double sum = 0;
    private static  double j = 0;

    public static void main(String[] args) {

        System.out.print("How many numbers do you want to add? ");
        j = input.nextInt();

        new LoopNumber();
        double total = LoopNumber.numberType(j,sum);

        String finalOutput = "The total is " + total + ".";

        System.out.println(finalOutput);
    }


}
