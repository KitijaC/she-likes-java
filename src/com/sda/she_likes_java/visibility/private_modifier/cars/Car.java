package com.sda.she_likes_java.visibility.private_modifier.cars;

// it's not possible to mark class as private
public class Car {
    private String brand;
    public String model;
    String color;

    public String getBrand() {
        return brand;
    }

     void setBrand(String brand) {
        this.brand = brand;
     }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
