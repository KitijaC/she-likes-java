package com.sda.she_likes_java.strings;

import java.sql.SQLOutput;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Kitija";
        String surname = "Cietvira";
        int age = 27;

        // Hi, I'm (name) (surname). I am (age) years old.
        System.out.println("Hi, I'm " + name + " " + surname + ". I am " + age + " years old.");
        // %s means string wildcard
        // %d means number wildcard
        System.out.println(String.format("Hi, I'm %s %s. I am %d years old.",name, surname, age));
        System.out.println("Hi, I'm %s %s. I am %d years old.".formatted(name, surname, age));
    }
}
