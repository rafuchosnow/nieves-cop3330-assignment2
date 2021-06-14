/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex30;

public class MultiplicationTable {
    public static String printTable(int i, int j) {

        String outputString = "";

        for(i = 1 ; i <= 12; i++) {

            for(j = 1; j <= 12; j++) {

                outputString += i * j + "\t";
            }
            outputString += "\n";
        }

        return outputString;
    }
}
