/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex35;

import java.util.ArrayList;
import java.util.Arrays;


public class ex35 {
    public static int j = 2;
    public static int i = 0;

    public static void main(String[] args) {

        ContestantManager CM = new ContestantManager();

        ArrayList<String> Contestants = new ArrayList<String>(Arrays.asList());

        i = CM.enterContestants(Contestants, i, j);

        int winner = CM.randomNumber(i);
        String outputString = "The winner is... " + Contestants.get(winner);

        System.out.println(outputString);
    }

}
