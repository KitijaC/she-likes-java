package com.sda.she_likes_java.homework.H_work_18.exercise_20;

public class CarUtils {
    public void safeCast(Car car) {
        if (car instanceof Mazda) {
            System.out.println("It's Mazda");
            ((Mazda) car).driveFast();
            ((Mazda) car).wheelChange();
            ((Mazda) car).driveSlow();
        } else if (car instanceof Toyota) {
            System.out.println("It's Toyota");
            ((Toyota) car).broke();
            ((Toyota) car).repair();
            ((Toyota) car).colorChange();
        } else {
            System.out.println("It's different type of car");
        }
    }
}

