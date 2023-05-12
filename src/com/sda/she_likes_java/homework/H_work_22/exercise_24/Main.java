//Homework:)
//Create a class English-Lithuanian dictionary.
//Requirements:
//- the class has a translate method that takes an English word as an argument;
//- add support for 10 words;
//- if the user asks for an unsupported word - add a message about the lack of support.
//Create a class Main and check the functionality of your class.

package com.sda.she_likes_java.homework.H_work_22.exercise_24;


public class Main {
    public static void main(String[] args) {
        EnglishLatvianDictionary dictionary = new EnglishLatvianDictionary();

        System.out.println("");
        System.out.println("English-Latvian dictionary:");
        System.out.println("");

        String word1 = "hello";
        String translation1 = dictionary.translate(word1);
        System.out.println(word1 + " => " + translation1);

        String word2 = "cat";
        String translation2 = dictionary.translate(word2);
        System.out.println(word2 + " => " + translation2);

        String word3 = "car";
        String translation3 = dictionary.translate(word3);
        System.out.println(word3 + " => " + translation3);

        String word4 = "computer";
        String translation4 = dictionary.translate(word4);
        System.out.println(word4 + " => " + translation4);

        String word5 = "tree";
        String translation5 = dictionary.translate(word5);
        System.out.println(word5 + " => " + translation5);

    }

}
