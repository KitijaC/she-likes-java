//Exercise 11.
//Try to rewrite previous exercises using functions:
//- first function with shape: boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell)
//- second function with shape: boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell)
//- rest of requirements stays the same

package com.sda.she_likes_java.homework;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("It's time to party!");

        checkedByYoungBouncer(20, 170, false);
    }

    public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell) {
        String declineMessage = "Sorry, you can't attend the party. Maybe next time!";
        String canEnterDiscoMessage = "Congrats! You can enter the party!";

        System.out.println();
        System.out.println("Hello! This is the Young Bouncer.");
        System.out.println();
        System.out.println("What is your age?");
        System.out.println("- My age is " + age);
        System.out.println();
        System.out.println("What is your height?");
        System.out.println("- My height is " + height + "cm");
        System.out.println();
        System.out.println("Is it true or false that you can sing well?");
        System.out.println("- " + isAbleToSingWell);
        System.out.println();

        boolean youngBouncer = age >= 18 && height >= 160 && isAbleToSingWell;

        if (youngBouncer) {
            System.out.println(canEnterDiscoMessage);
        } else {
            System.out.println(declineMessage);

            checkedByOldBouncer(10, 140, true);
        }

        return youngBouncer;
    }

    public static boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell) {
        String declineMessage = "Sorry, you can't attend the party. Maybe next time!";
        String canEnterDiscoMessage = "Congrats! You can enter the party!";

        System.out.println();
        System.out.println("Hello! This is the Old Bouncer.");
        System.out.println();
        System.out.println("What is your age?");
        System.out.println("- My age is " + age);
        System.out.println();
        System.out.println("What is your height?");
        System.out.println("- My height is " + height + "cm");
        System.out.println();
        System.out.println("Is it true or false that you can sing well?");
        System.out.println("- " + isAbleToSingWell);
        System.out.println();

        boolean oldBouncer = age >= 18 || height >= 160 || isAbleToSingWell;

        if (oldBouncer) {
            System.out.println(canEnterDiscoMessage);
        } else {
            System.out.println(declineMessage);
        }

        return oldBouncer;
    }
}
