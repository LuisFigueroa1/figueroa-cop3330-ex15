package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 15 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String passw; //declare the variable

        System.out.println("What is the password? ");
        passw = userInput.nextLine();

        //stablish the correct one
        if (passw.equals("abc$123")) {

            System.out.println("Welcome!");
        }

        //if is wrong then
        else {
            System.out.println("I don't know you.");
        }
    }
}