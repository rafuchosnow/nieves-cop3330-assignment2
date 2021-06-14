/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex36;

import java.util.ArrayList;
import java.util.Arrays;

public class ex36 {
    public static int j = 2;
    public static int i = 0;
    public static String outputString = "";

    public static void main(String[] args) {
        numberManager NM = new numberManager();

        ArrayList<String> Numbers = new ArrayList<String>(Arrays.asList());

        NM.enterNumbers(Numbers, i, j);

        outputString = NM.printList(Numbers);
        System.out.print(outputString);

        outputString = NM.findAverage(Numbers);
        System.out.print(outputString);

        outputString = NM.findMinimum(Numbers);
        System.out.print(outputString);

        outputString = NM.findMaximum(Numbers);
        System.out.print(outputString);

        outputString += NM.findSTDdev(Numbers);
        System.out.print(outputString);
    }
}
