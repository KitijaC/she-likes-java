package com.sda.she_likes_java.homework.H_work_05;

import java.util.Scanner;

//Exercise 9.
//Bouncer in a disco
//Prepare a new class BouncerInDisco and in it
//- get the user’s age and height from the console
//- only people who are at least 16 years old and taller (or shorter than - at your choice) can enter the disco
//- print a text saying how the verification went in both cases

public class BouncerInDisco {
    public static void main(String[] args) {

        int usersAge;
        int usersHeight;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter your age: ");
        usersAge = inputReader.nextInt();

        System.out.println("Enter your height: ");
        usersHeight = inputReader.nextInt();

        if (usersAge >= 16 && usersHeight >= 160) {
            System.out.println("You can enter the disco!");
        } else {
            System.out.println("Sorry, you can't enter the disco!");
        }

    }
}
