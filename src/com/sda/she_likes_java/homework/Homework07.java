//Exercise 11.
//Try to rewrite previous exercises using functions:
//- first function with shape: boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell)
//- second function with shape: boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell)
//- rest of requirements stays the same

package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Homework07 {

    public static void main(String[] args) {
        System.out.println("It's time to party!");

        String declineMessage = "Sorry, you can't attend the party. Maybe next time!";
        String canEnterDiscoMessage = "Congrats! You can enter the party!";

        System.out.println();
        System.out.println("Hello! This is the Young Bouncer.");
        System.out.println("What is your age?");
        Scanner inputReader = new Scanner(System.in);
        int age = inputReader.nextInt();
        System.out.println("What is your height?");
        int height = inputReader.nextInt();
        System.out.println("Is it true or false that you can sing well?");
        boolean isAbleToSingWell = inputReader.nextBoolean();

        boolean youngBouncer = checkedByYoungBouncer(age, height, isAbleToSingWell);

        if (youngBouncer) {
            System.out.println(canEnterDiscoMessage);
        } else {
            System.out.println(declineMessage);

            System.out.println();
            System.out.println("Hello! This is the Old Bouncer.");
            System.out.println("What is your age?");
            age = inputReader.nextInt();
            System.out.println("What is your height?");
            height = inputReader.nextInt();
            System.out.println("Is it true or false that you can sing well?");
            isAbleToSingWell = inputReader.nextBoolean();

            boolean oldBouncer = checkedByOldBouncer(age, height, isAbleToSingWell) ;

            if (oldBouncer) {
                System.out.println(canEnterDiscoMessage);
            } else {
                System.out.println(declineMessage);
            }
        }
    }

    public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell) {
        return age >= 18 && height >= 160 && isAbleToSingWell;
    }

    public static boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell) {
        return age >= 18 || height >= 160 || isAbleToSingWell;
    }
}
