/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex31;

import java.text.DecimalFormat;

public class HeartRate {

    public static String calculateRate(double restingHR, double age) {
        DecimalFormat dfRate = new DecimalFormat("#");


        String outputString = "Resting pulse: " + dfRate.format(restingHR) + "     Age: " + dfRate.format(age) + "\n" +
                              "Intensity   | Rate \n" +
                              "-----------------------\n";

        double intensity;
        for(intensity = 0.55 ; intensity <= 0.95 ; intensity += 0.05){

            double targetHR = (((220 - age) - restingHR) * intensity) + restingHR;
            outputString += dfRate.format(intensity*100) + "%         | " + dfRate.format(targetHR) + " bpm\n";
        }

        return outputString;
    }
}
