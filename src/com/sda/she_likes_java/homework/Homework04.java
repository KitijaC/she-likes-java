package com.sda.she_likes_java.homework;
// Exercise 8.
//Create calculator with 4 supported operations, which is able to read input from user.

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("This is a calculator");
        System.out.println("This calculator supports 4 operations: sum, difference, product and quotient");
        System.out.println("Provide two numbers to see the result");
        System.out.println();

        System.out.println("Sum");
        System.out.println("Please provide the first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println();
        System.out.println("Please provide the second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println();
        System.out.println("The sum is: " + sum);

        System.out.println();
        System.out.println("Difference");
        System.out.println("Please provide the first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println();
        System.out.println("Please provide the second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int difference = firstNumber - secondNumber;
        System.out.println();
        System.out.println("The difference is: " + difference);

        System.out.println();
        System.out.println("Product");
        System.out.println("Please provide the first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println();
        System.out.println("Please provide the second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int product = firstNumber * secondNumber;
        System.out.println();
        System.out.println("The product is: " + product);


        System.out.println();
        System.out.println("Quotient");
        System.out.println("Please provide the first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println();
        System.out.println("Please provide the second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int quotient = firstNumber / secondNumber;
        System.out.println();
        System.out.println("The quotient is: " + quotient);
    }
}


