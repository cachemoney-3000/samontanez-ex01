/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Samontanez
 */

package exercise01;

import java.util.Scanner;

public class Solution01 {
    /*
    Create a program.
    print "What is your name?" to prompt user,
    scanner reads the user's input,
    'name' = reads/store string input from user.
    print "Hello, <name>, nice to meet you"
    */

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}

