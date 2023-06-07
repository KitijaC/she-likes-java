//Homework
//Create Calculator interface with 4 methods:
//add
//sub
//div
//mult
//Three methods should be implemented as default ones, the fourth should be created with lambda in Main class.

package com.sda.she_likes_java.homework.H_work_29.exercise_31;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int mult(int first, int second) {
                return first * second;
            }
        };
        int result = calculator.add(10, 6);
        System.out.println("Result of addition between 10 and 6 is: " + result);

        result = calculator.sub(20, 5);
        System.out.println("Result of subtraction between 20 and 5 is: " + result);

        result= calculator.div(30, 2);
        System.out.println("Result of division between 30 and 2 is: " + result);

        Calculator calcMult = (first, second) -> first * second; {
            int resultMult = calcMult.mult(8, 5);
            System.out.println("Result of multiplication between 8 and 5 is: " + resultMult);
        }
    }
}
