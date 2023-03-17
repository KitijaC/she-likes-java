package com.sda.she_likes_java.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBreak {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;
//        System.out.println("random number provided by java is: " + someRandomNumber);

        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        System.out.println("Play game with me:)");
        System.out.println("You can try to guess a number only 8 times");
        do {
            System.out.println("Guess a number between 1 and 20");
            userAnswer = inputReader.nextInt();
            numberOfTrials--;
            if (numberOfTrials <= 0) {
                break;
            }

        } while (userAnswer != someRandomNumber);

        if (userAnswer == someRandomNumber) {
            System.out.println("Great, You win!!!");
        } else {
            System.out.println("Sorry, you didn't guessed. Try again!");
        }
    }
}
