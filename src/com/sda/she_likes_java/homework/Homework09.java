//Exercise 12
//Draw three numbers using the Random.nextInt() function.
//Sort them and output them from smallest to largest.

package com.sda.she_likes_java.homework;

import java.util.Random;

public class Homework09 {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int firstRandomNumber = numberGenerator.nextInt(100);
        int secondRandomNumber = numberGenerator.nextInt(100);
        int thirdRandomNumber = numberGenerator.nextInt(100);

        int temp;

        if (secondRandomNumber < firstRandomNumber) {
            temp = firstRandomNumber;
            firstRandomNumber = secondRandomNumber;
            secondRandomNumber = temp;
        }

        if (thirdRandomNumber < secondRandomNumber) {
            temp = secondRandomNumber;
            secondRandomNumber = thirdRandomNumber;
            thirdRandomNumber = temp;
        }

        if (secondRandomNumber < firstRandomNumber) {
            temp = firstRandomNumber;
            firstRandomNumber = secondRandomNumber;
            secondRandomNumber = temp;
        }

        System.out.println("Three random numbers from 1 to 100 in ascending order are: "
                + firstRandomNumber + "; " + secondRandomNumber + "; " + thirdRandomNumber);
    }
}
