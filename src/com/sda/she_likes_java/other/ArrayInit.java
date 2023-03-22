package com.sda.she_likes_java.other;

/*
        Create an int array with 100 elements and name it numbers
        Initialise each element with a value 3 times greater than the current index
        e.g.
        numbers[0] = 3 * 0
        numbers[10] = 3 * 10.
     */

public class ArrayInit {

    public static void main(String[] args) {
        // Create an int array with 100 elements
        int[] numbers = new int[100];

        // initialization phase
        // first index is: 0
        // last index is: numbers.length - 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Current value of i is: " + i);
            numbers[i] = 3 * i;
            // numbers[i -1]
        }

        // read data from last element till first one
        for (int i = numbers.length - 1; i >= 0; i--) { // instead of i>=0 can be i > -1;
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}