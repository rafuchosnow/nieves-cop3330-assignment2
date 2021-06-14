/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex24;

import java.util.Scanner;

public class ex24 {
    private static final Scanner input = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {

        userString();

        AnagramString as = new AnagramString();
        boolean result = as.isAnagram (word1, word2);

        String finalOutput = outputString(result);

        System.out.println(finalOutput);
    }

    public static void userString() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        word2 = input.nextLine();
    }

    public static String outputString(boolean isAnagram) {
        if(isAnagram){
            return "\"" + word1 + "\" and \"" + word2 + "\" are anagrams.";
        }
        else {
            return "\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.";
        }
    }
}

