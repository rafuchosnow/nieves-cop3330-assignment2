/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    private static final Scanner input = new Scanner(System.in);

    public static String MagicAnswer(){
        ArrayList<String> Responses = new ArrayList<String>
                (Arrays.asList("Yes.", "No.", "Maybe.", "Ask again later."));

        System.out.print("What is your question? \n> ");
        String question = input.nextLine();

        int answer = randomNumber();

        return Responses.get(answer);
    }

    public static int randomNumber(){

        Random rand = new Random();
        int randomRoll = rand.nextInt(4);
        return randomRoll;
    }
}
