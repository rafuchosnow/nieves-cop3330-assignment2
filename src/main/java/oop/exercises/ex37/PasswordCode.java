/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PasswordCode {

    public static ArrayList<String> passwordCreator(int total,int numbers,int letters,int special) {

        ArrayList<String> passwordList = new ArrayList<String>(Arrays.asList());

        Random rand = new Random();
        int charPicker = 0;
        char ListChar;
        String ListString = "";
        int numberCounter = 0;
        int specialCounter = 0;
        int letterCounter = 0;

        for (int i = 0; i <= total; i++) {
            charPicker = rand.nextInt(4);

            if (charPicker == 0 && numberCounter < numbers) {  //Numbers

                ListChar = (char)rand.ints(48,57).findFirst().getAsInt();
                ListString = String.valueOf(ListChar);
                passwordList.add(ListString);
                numberCounter++;
            }
            else {
                if(numberCounter == numbers) {
                    i--;
                }
            }
            if (charPicker == 1 && letterCounter <= letters) {  //Uppercase

                ListChar = (char)rand.ints(65,90).findFirst().getAsInt();
                ListString = String.valueOf(ListChar);
                passwordList.add(ListString);
                letterCounter++;
            }
            else {
                if(numberCounter == letters) {
                    i--;
                }
            }
            if (charPicker == 2 && letterCounter < letters) {  //Lowercase

                ListChar = (char)rand.ints(97,122).findFirst().getAsInt();
                ListString = String.valueOf(ListChar);
                passwordList.add(ListString);
                letterCounter++;
            }
            else {
                if(numberCounter == letters) {
                    i--;
                }
            }
            if (charPicker == 3 && specialCounter < special) {  //Numbers

                ListChar = (char)rand.ints(33,47).findFirst().getAsInt();
                ListString = String.valueOf(ListChar);
                passwordList.add(ListString);
                specialCounter++;
            }
            else {
                if(numberCounter == special) {
                    i--;
                }
            }
        }

        return passwordList;
    }
}
