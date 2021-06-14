/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex37 {
    private static final Scanner input = new Scanner(System.in);

    private static int minimum;
    private static int special;
    private static int numbers;
    private static int letters;
    private static int total;

    public static void main(String[] args) {

        //'0' - '9' => 48-57 in ASCII
        //'A' - 'Z' => 65-90 in ASCII
        //'a' - 'z' => 97-122 in ASCII
        //Special => 33-47 in ASCII

        userString();

        PasswordCode PC = new PasswordCode();

        ArrayList<String> password = PC.passwordCreator(total,numbers,letters,special);

        String outputString = "Your password is ";

        for (int i = 0; i < password.size(); i++) {

            outputString += password.get(i);
        }

        System.out.println(outputString);
    }

    public static void userString() {
        System.out.print("What's the minimum length? ");
        minimum = input.nextInt();
        System.out.print("How many special characters? ");
        special = input.nextInt();
        System.out.print("How many numbers? ");
        numbers = input.nextInt();

        letters = special + numbers;

        if (minimum < ((special + numbers) * 2)) {
            total = (special + numbers) * 2;
        } else {
            total = minimum;
        }
    }
}

