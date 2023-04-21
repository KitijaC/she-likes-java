//Exercise 18.
//Create an Airplane class that provides the following operations:
//- takeOff
//- land
//- flyTo(int xCoordinates, int yCoordinates)
//- retrieve the current state of the airplane (flies/waits in hangar)
//When implementing, remember that:
//- the aircraft must be in the air to land
//- you cannot take off if you are already in the air
//- use variables to store internal state
//- check the use of your class in the main method
//- have fun

package com.sda.she_likes_java.homework.H_work_16.exercise_18;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(); // we create new Airplane object and store it in the airplane variable
        System.out.println("The airplane is ready and we are flying soon!");
        System.out.println();
        System.out.println("Current state: " + airplane.getCurrentState()); //we call the getCurrentState() method in the airplane and print the result
        System.out.println();

        airplane.takeOff();
        System.out.println("Current state: " + airplane.getCurrentState());
        System.out.println();

        airplane.flyingTo(505, 125);
        System.out.println("Current state: " + airplane.getCurrentState());
        System.out.println();

        airplane.landing();
        System.out.println("Current state: " + airplane.getCurrentState());
    }
}
