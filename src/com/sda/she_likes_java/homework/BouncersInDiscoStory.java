//Exercise 10.
//A story about bouncers in a disco
//Prepare a new class BouncersInDiscoStory and in it
//- get the user’s age, ability to sing well and height from the console
//- there are two bouncers in the disco: young and old
//- Young checks if the person is adult, tall (or short :)) and can sing well
//- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
//- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:)

package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncersInDiscoStory {
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
        boolean canSing = inputReader.nextBoolean();

        boolean youngBouncer = age >= 18 && height >= 160 && canSing;

        if (youngBouncer) {
            System.out.println(canEnterDiscoMessage);
        } else {
            System.out.println(declineMessage);

            System.out.println();
            System.out.println("Hello! This is the Old Bouncer and you can try again.");
            System.out.println("What is your age?");
            age = inputReader.nextInt();
            System.out.println("What is your height?");
            height = inputReader.nextInt();
            System.out.println("Is it true or false that you can sing well?");
            canSing = inputReader.nextBoolean();

            boolean oldBouncer = age >= 18 || height >= 160 || canSing;

            if (oldBouncer) {
                System.out.println(canEnterDiscoMessage);
            } else {
                System.out.println(declineMessage);
            }
        }
    }
}
