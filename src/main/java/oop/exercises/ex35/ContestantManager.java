/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ContestantManager {
    private static final Scanner input = new Scanner(System.in);

    public static int enterContestants(ArrayList<String> Contestants, int i, int j){
        for (i = 0; i < j; i++){
            System.out.print("Enter a name: ");
            String addList = input.nextLine();
            Contestants.add(addList);

            String blankChecker = Contestants.get(i);
            if (blankChecker.equals("")){
                break;
            }
            ++j;
        }
        return i;
    }

    public static int randomNumber(int i){

        Random rand = new Random();
        return rand.nextInt(i);
    }

}
