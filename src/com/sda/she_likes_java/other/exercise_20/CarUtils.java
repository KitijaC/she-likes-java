package com.sda.she_likes_java.other.exercise_20;

public class CarUtils {
    public static void safeCast(Car car) { // without "static"word we need to create in the Main class new objects CarUtil()
        if (car instanceof Mazda) {
            System.out.println("Is Mazda nice: " + ((Mazda) car).isNice());
        } else if (car instanceof Toyota) {
            System.out.println("Is Toyota safe: " + ((Toyota) car).isSafe());
        } else {
            System.out.println("Different type of car");
        }
    }
}
