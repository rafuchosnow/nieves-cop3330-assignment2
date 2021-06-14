/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex29;

public class RuleOf72 {

    public static double calculateYears(String rateString){

        new ex29();

        rateString = ex29.LoopRate(rateString);

        double rateNumber = Double.parseDouble(rateString);

        return Math.ceil(72 / rateNumber);
    }
}
