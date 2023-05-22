//Exercise 28.
//Create a class implementing the Comparator interface to sort objects of type String based on their length.
//Prepare the Main class and perform sorting on the examples.

package com.sda.she_likes_java.homework.H_work_26.exercise_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Name> personName = new ArrayList<>();
        personName.add(new Name("Amanda", "Z."));
        personName.add(new Name("Linda", "Lee"));
        personName.add(new Name("Ann", "Green"));
        personName.add(new Name("Ann", "Greenwood"));
        personName.add(new Name("Elizabeth", "Morgan"));
        personName.add(new Name("Mel", "Lockwood"));
        personName.add(new Name("Amanda", "Tann"));

        Collections.sort(personName);
        System.out.println("Names sorted by length of first name: " + personName);

        ComparingSurnameLength comparingNameAndSurnameLength = new ComparingSurnameLength();
        Collections.sort(personName, comparingNameAndSurnameLength);
        System.out.println("Names and then surnames sorted by length: ");
    }
}
