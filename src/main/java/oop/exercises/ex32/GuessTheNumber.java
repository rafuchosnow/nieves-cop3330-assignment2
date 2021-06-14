/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex32;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private static final Scanner input = new Scanner(System.in);

    public static void playGame() {

        String difficultyString;
        int difficulty;
        String playAgain = "y";

        Random rand = new Random();
        int randomNumber;

        String guessString;
        int userGuess = -1;
        int counter = 0;

        System.out.print("Let's play Guess the Number!");

        while (playAgain.equals("y") || playAgain.equals("Y")) {

            while (true) {

                System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
                difficultyString = input.nextLine();

                // Test if value is numerical

                try {
                    difficulty = Integer.parseInt(difficultyString);
                    if (difficulty == 1) {
                        randomNumber = rand.nextInt(11);
                        break;
                    } else if (difficulty == 2) {
                        randomNumber = rand.nextInt(101);
                        break;
                    } else if (difficulty == 3) {
                        randomNumber = rand.nextInt(1001);
                        break;
                    }
                } catch (NumberFormatException exception) {
                    System.out.println("Please enter 1, 2 or 3.");
                }
            }

            //System.out.println("The random number is " + randomNumber);

            System.out.print("I have my number. What's your guess? ");

            while (true) {
                guessString = input.nextLine();

                // Test if value is numerical

                try {
                    userGuess = Integer.parseInt(guessString);
                } catch (NumberFormatException ex) {
                    System.out.print("Please enter Integer values only. Guess again: ");
                }

                if (userGuess == randomNumber) {
                    counter += 1;
                    break;
                } else if (userGuess < randomNumber && userGuess > -1) {
                    System.out.print("Too low. Guess again: ");
                } else if (userGuess > randomNumber) {
                    System.out.print("Too high. Guess again: ");
                }
                counter += 1;
                userGuess = -1;

            }

            System.out.println("\nYou got it in " + counter + " guesses! \n");

            System.out.print("Do you wish to play again (Y/N)? ");
            playAgain = input.nextLine();
        }
        System.out.println("Thanks for playing (°͜ʖ°)");
    }
}
