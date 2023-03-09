package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {

        int usersAge;
        int usersHeight;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter your age: ");
        usersAge = inputReader.nextInt();

        System.out.println("Enter your height: ");
        usersHeight = inputReader.nextInt();

        if ((usersAge >= 16) && (usersHeight >= 160)) {
            System.out.println("You can enter the disco!");
        } else {
            System.out.println("Sorry, you can't enter the disco!");
        }

    }
}
