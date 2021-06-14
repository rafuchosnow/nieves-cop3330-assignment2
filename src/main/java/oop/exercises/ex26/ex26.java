/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex26;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex26 {
    private static final Scanner input = new Scanner(System.in);

    private static double balance;
    private static double APR;
    private static double payment;
    private static double result = 0;

    public static void main(String[] args) {

        userString();

        PaymentCalculator PC = new PaymentCalculator();
        result =  PC.calculateMonthsUntilPaidOff(balance, APR, payment);

        String finalOutput = outputString();

        System.out.println(finalOutput);
    }

    public static void userString() {

        System.out.print("What is your balance? ");
        balance = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        APR = input.nextDouble();


        System.out.print("What is the monthly payment you can make? ");
        payment = input.nextDouble();
    }

    public static String outputString() {
        DecimalFormat dfPayment = new DecimalFormat("#");

        return "It will take you " + dfPayment.format(Math.ceil(result)) + " months to pay off this card.";
    }
}
