//Exercise 21.
//Create Vehicle class containing a move() method
//Create three interfaces Floating, Flying, Diving.
//Create an Airplane class that extends Vehicle and implements the Flying interface.
//Create a class Ship which extends Vehicle and implements the Floating interface.
//Create the class Submarine which extends the Vehicle and implements the Diving interface.
//Create the class Main which contains the main method and check the operation of the prepared hierarchy of objects.
//When do you need to cast between types?


package com.sda.she_likes_java.homework.H_work_19.exercise_21;

public class Main {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane();
        myAirplane.move();
        myAirplane.fly();

        Ship myShip = new Ship();
        myShip.move();
        myShip.floatt();

        Submarine mySubmarine = new Submarine();
        mySubmarine.move();
        mySubmarine.dive();

    }
}
