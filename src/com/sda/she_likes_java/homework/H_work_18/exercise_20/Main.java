package com.sda.she_likes_java.homework.H_work_18.exercise_20;

public class Main {

    public static void main(String[] args) {

        CarUtils carUtilsMazda = new CarUtils();
        carUtilsMazda.safeCast(new Mazda());

        System.out.println("");

        CarUtils carUtilsToyota = new CarUtils();
        carUtilsToyota.safeCast(new Toyota());

        System.out.println("");

        CarUtils carUtilsFerrari = new CarUtils();
        carUtilsFerrari.safeCast(new Ferrari());
    }
}
