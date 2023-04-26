package com.sda.she_likes_java.other.casting_example;

public class Main {
    public static void main(String[] args) {
        CarUtils.safeCast(new Mazda());
        CarUtils.safeCast(new Ferrari());
        CarUtils.safeCast(new Toyota());
        CarUtils.safeCast(new Car());
        BMW bmw = new BMW();
        bmw.speedUp();
        Car bwm = new BMW();
        CarUtils.safeCast(bwm);
    }
}
