package com.sda.she_likes_java.objects_equality;

public class Car {
    public String color;

    public Car(String color) {
        color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
