//Exercise 12
//Draw three numbers using the Random.nextInt() function.
//Sort them and output them from smallest to largest.

package com.sda.she_likes_java.homework;

import java.util.Arrays;
import java.util.Random;

public class Homework09 {
    public static void main(String[] args) {

        Random numberGenerator = new Random();
        int firstRandomNumber = numberGenerator.nextInt(100);
        int secondRandomNumber = numberGenerator.nextInt(100);
        int thirdRandomNumber = numberGenerator.nextInt(100);

        System.out.println("Three random numbers from 1 to 100 are: "
                + firstRandomNumber + "; " + secondRandomNumber + "; " + thirdRandomNumber);

        int[] numbers = {firstRandomNumber, secondRandomNumber, thirdRandomNumber};
        Arrays.sort(numbers);

        System.out.println("These numbers in ascending order: "
                + numbers[0] + "; " + numbers[1] + "; " + numbers[2]);
    }
}
