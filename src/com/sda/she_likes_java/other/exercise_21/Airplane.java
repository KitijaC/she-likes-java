package com.sda.she_likes_java.other.exercise_21;

public class Airplane extends Vehicle implements Flying {
    @Override
    public void fly() {
        System.out.println("Fly from Airplane");
    }
}
