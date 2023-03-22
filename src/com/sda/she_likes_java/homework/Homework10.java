//Exercise 13
//Create an int array with 100 elements
//Initialise each element with a value 3 times greater than the current index
//e.g.
//tab[0] = 3 * 0
//tab[10] = 3 * 10.

package com.sda.she_likes_java.homework;

public class Homework10 {
    public static void main(String[] args) {
        //Create an int array with 100 elements
        int[] numbers = new int[100];

        //initialization phase
        //first index is: 0
        //last index is: number.length - 1
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 3;
            //numbers[i -1]
        }

        //read data
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Number * 3 on index: " + index + " is " + numbers[index]);
        }
    }
}
