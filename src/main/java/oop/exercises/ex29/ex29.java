/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex29;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex29 {
    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        new RuleOf72();

        String rateString = "0";
        double years = RuleOf72.calculateYears(rateString);

        String outputString = "It will take " + years + " years to double your initial investment.";

        System.out.println(outputString);
    }

    public static String LoopRate(String rateString ) {

        while (rateString.matches("\\b[^0-9]+\\b.*")  || rateString.equals("0")) {
            System.out.print("What is the rate of return? ");
            rateString = input.nextLine();

            if (rateString.matches("\\b[^0-9]+\\b.*") || rateString.equals("0")){
                System.out.print("Sorry. That's not a valid input. \n");
            }
        }

        return rateString;
    }
}
