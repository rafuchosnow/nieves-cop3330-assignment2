/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex25;

public class passwordCreator {

    public int passwordValidator(String password){
        if (password.length() < 8){
            if (password.matches("\\b[0-9]+\\b.*")) {
                return 0;
            }
            else if(password.matches("\\b[a-zA-Z]+\\b.*")){
                return 1;
            }
            else if (password.matches("\\b[a-zA-Z0-9]+\\b.*")) {
                return 1;
            }
        }

        else if (password.length() >= 8){
            if (password.matches("\\b[a-zA-Z]+\\b.*") ||  password.matches(".*\\b[0-9]+\\b.*")){
                return 2;
            }
            else if (password.matches("\\b[a-zA-Z0-9]+\\b.*")) {
                return 2;
            }
            else if (password.matches("\\b[\\x21-\\x7a]+\\b.*")) {
                return 3;
            }
        }
        return 1;
    }
}
