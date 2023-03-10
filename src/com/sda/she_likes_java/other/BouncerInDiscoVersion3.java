package com.sda.she_likes_java.other;

import java.util.Scanner;

public class BouncerInDiscoVersion3 {
    public static void main(String[] args) {
        System.out.println("Party time???");

        System.out.println("Somebody is coming to club");
        System.out.println("Hi, how old are you: ");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home";
        int age = inputReader.nextInt();
        System.out.println("Let me know Your height now:");
        int height = inputReader.nextInt();
        boolean isAllowedToParty = age >= 18 && height >= 200;

        if (isAllowedToParty) {
            System.out.println("Great!!! Welcome to the party!");
        } else {
            System.out.println(declineMessage);
        }
    }
}
