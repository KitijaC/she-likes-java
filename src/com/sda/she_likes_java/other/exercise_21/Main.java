package com.sda.she_likes_java.other.exercise_21;

public class Main {
    public static void main(String[] args) {
        Ship justShip = new Ship();
        justShip.move();
        Vehicle ship = new Ship();
        ship.move();
//        ship.swin();
        ((Floating) ship).swim();
        ((Ship) ship).swim();

        Vehicle airplane = new Airplane();
        airplane.move();
        ((Flying) airplane).fly();

        Vehicle submarine = new Submarine();
        submarine.move();
        ((Diving) submarine).dive();
    }
}
