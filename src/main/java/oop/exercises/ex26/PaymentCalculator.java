/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex26;

import java.text.DecimalFormat;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double APR, double payment) {

        double rate = (APR / 100)/365;

        double numerator = (-1) * (Math.log(1 + ((balance / payment) * (1 - Math.pow(1 + rate, 30)))));

        double denominator = 30 * (Math.log(1 + rate));

        double result = numerator / denominator;

        return Math.ceil(result);
    }
}
