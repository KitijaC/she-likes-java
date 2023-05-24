//Exercise 29
//Create a class to check the postal code format with one method: void checkPostalCode(String postalCode).
//The method returns nothing if the code format is correct.
//Otherwise it throws a PostalCodeException exception.

package com.sda.she_likes_java.homework.H_work_27.exercise_29;

public class Main {
    public static void main(String[] args) {

        CheckPostalCode postalCode = new CheckPostalCode("LV3266");
        postalCode.checkPostalCode();
        System.out.println("No exceptions were thrown.");
    }
}
