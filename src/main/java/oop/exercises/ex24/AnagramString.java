/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex24;

import java.util.Locale;
import java.util.Arrays;

public class AnagramString {

    public boolean isAnagram(String Word1, String Word2) {
        Word1 = Word1.toLowerCase(Locale.ROOT);
        Word2 = Word2.toLowerCase(Locale.ROOT);

        Word1 = Word1.replaceAll("\\s", "");
        Word2 = Word2.replaceAll("\\s", "");

        if(Word1.length() == Word2.length()) {

            char[] charWord1 = Word1.toCharArray();
            char[] charWord2 = Word2.toCharArray();

            Arrays.sort(charWord1);
            Arrays.sort(charWord2);

            if (Arrays.equals(charWord1, charWord2)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
