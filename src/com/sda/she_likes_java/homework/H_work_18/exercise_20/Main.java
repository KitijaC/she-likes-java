package com.sda.she_likes_java.homework.H_work_18.exercise_20;

public class Main {

    public static void main(String[] args) {
        Car firstCar = new Ferrari();
        firstCar.drive();

        Car secondCar = new Toyota();
        secondCar.drive();

        Car thirdCar = new Mazda();
        thirdCar.drive();

        System.out.println("");

        CarUtils carUtilsMazda = new CarUtils();
        carUtilsMazda.safeCast(new Mazda());

        System.out.println("");

        CarUtils carUtilsToyota = new CarUtils();
        carUtilsToyota.safeCast(new Toyota());
    }
}
