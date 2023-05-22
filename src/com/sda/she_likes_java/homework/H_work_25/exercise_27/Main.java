//Exercise 27
//Create a MyDate class containing three fields:
//- year - of type int
//- month - of type int
//- day - of type int
//Implement the Comparable interface for your class.
//Create a Main class, add four MyDate objects to the list and perform sorting.

package com.sda.she_likes_java.homework.H_work_25.exercise_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyDate wedding = new MyDate(2025, 03, 3);
        MyDate birthday = new MyDate(1995,07,9);
        MyDate graduation = new MyDate(2017, 06,28);
        MyDate moving = new MyDate(2019, 05,21);

        List<MyDate> dates = new ArrayList<>();
        dates.add(moving);
        dates.add(birthday);
        dates.add(wedding);
        dates.add(graduation);

        Collections.sort(dates);
        System.out.println("Important dates sorted: " + dates);
    }
}
