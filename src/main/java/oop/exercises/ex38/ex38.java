/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex38 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {



        ArrayList<String> Numbers = new ArrayList<String>(Arrays.asList());
        int i, j;
        j = 0;

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String NumberList = "";

        for (i = 0; i < j; i++){

            NumberList = input.next();
            Numbers.add(NumberList);

            String blankChecker = Numbers.get(i);
            if (blankChecker.equals("")){
                break;
            }
            ++j;
        }



    }


}
