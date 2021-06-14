/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner input = new Scanner(System.in);

    public static String printList(ArrayList<String> Employees) {

        String employeeList = "\nThere are " + Employees.size() + " employees: \n";
        for (int i = 0; i < Employees.size(); i++){
            employeeList += Employees.get(i) + "\n";
        }
        return employeeList;
    }

    public void removeList (ArrayList<String> Employees){
        System.out.print("Enter an employee name to remove: ");
        String remove = input.nextLine();
        Employees.remove(remove);
    }


}
