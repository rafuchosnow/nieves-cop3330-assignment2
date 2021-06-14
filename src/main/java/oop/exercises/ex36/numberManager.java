/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex36;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;


public class numberManager {
    private static final Scanner input = new Scanner(System.in);

    public void enterNumbers(ArrayList<String> Numbers, int i, int j){
        for (i = 0; i < j; i++){

            System.out.print("Enter a number (type done to finish): ");
            String addList = input.nextLine();
            Numbers.add(addList);

            String doneChecker = Numbers.get(i);
            if (doneChecker.equals("done")){
                break;
            }
            ++j;
        }
    }

    public static String printList(ArrayList<String> Numbers) {

        String numberList = "\nNumbers: ";
        for (int i = 0; i < Numbers.size(); i++){

            try {
                Integer.parseInt(Numbers.get(i));
                numberList += Numbers.get(i);
                if (i == Numbers.size()-1) {
                    numberList += ("");
                } else {
                    numberList += (", ");
                }
            } catch (NumberFormatException exception) {
                Numbers.remove(Numbers.get(i));
                i--;
            }
        }
        return numberList;
    }

    public static String findAverage(ArrayList<String> Numbers) {
        DecimalFormat dfRound = new DecimalFormat("#.##");
        double summation = 0;

        String average = "\nThe average is ";
        for (int i = 0; i < Numbers.size(); i++){

            summation += Double.parseDouble(Numbers.get(i));
        }
        average += summation / Numbers.size();
        return average + "\n";
    }

    public static String findMinimum(ArrayList<String> Numbers) {
        double smallest = Integer.MAX_VALUE;

        String minimum = "The minimum is ";
        for (int i = 0; i < Numbers.size(); i++){

            if (Double.parseDouble(Numbers.get(i)) < smallest) {
                smallest = Double.parseDouble(Numbers.get(i));
            }
        }
        minimum += smallest;
        return minimum + "\n";
    }

    public static String findMaximum(ArrayList<String> Numbers) {
        double largest = Integer.MIN_VALUE;

        String maximum = "The maximum is ";
        for (int i = 0; i < Numbers.size(); i++){

            if (Double.parseDouble(Numbers.get(i)) > largest) {
                largest = Double.parseDouble(Numbers.get(i));
            }
        }
        maximum += largest;
        return maximum + "\n";
    }

    public static String findSTDdev(ArrayList<String> Numbers) {
        DecimalFormat dfRound = new DecimalFormat("#.##");

        String STDdev = "The standard deviation is ";
        double summation = 0;

        double mean = 0;
        for (int i = 0; i < Numbers.size(); i++){
            summation += Double.parseDouble(Numbers.get(i));
        }
        mean = summation / Numbers.size();

        double temp = 0;

        for (int i = 0; i < Numbers.size(); i++) {

            double val = Double.parseDouble(Numbers.get(i));

            double sqrDiffToMean = Math.pow(val - mean, 2);

            temp += sqrDiffToMean;
        }

        double meanOfDiffs = (double) temp / (double) (Numbers.size());

        STDdev += dfRound.format(Math.sqrt(meanOfDiffs));

        return STDdev;
    }

}
