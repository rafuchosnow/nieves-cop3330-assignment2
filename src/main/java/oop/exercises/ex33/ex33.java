/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex33;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {

        Magic8Ball MB = new Magic8Ball();

        String outputString = MB.MagicAnswer();

        System.out.println(outputString);

    }
}
