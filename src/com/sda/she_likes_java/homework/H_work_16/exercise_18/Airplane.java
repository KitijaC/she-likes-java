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

public class Airplane { //declare class and instance variables
    private boolean isAirplaneFlying;
    private int xCoordinate;
    private int yCoordinate;


    public Airplane() { // define Airplane constructor with default values of the airplane
        isAirplaneFlying = false; // by default airplane is on the ground
        xCoordinate = 0;
        yCoordinate = 0;
    }

    public void takeOff() { // method
        if (isAirplaneFlying) { // check if isAirplaneFlying == true (if default value is true. And default value is true if it false (airplane by default is on the ground))
            System.out.println("Airplane is already in the air.");
        } else {
            isAirplaneFlying = true; // there we set the value to true - assign it to true, that means that airplane has taken off.
            System.out.println("The airplane has taken off.");
        }
    }

    public void landing() { //method
        if (isAirplaneFlying) { // check if isAirplaneFlying == false, if it's not then we assign it to false
            isAirplaneFlying = false; // assign it to false, because airplane is landing on the ground
            System.out.println("The airplane has landed.");
        } else { // if isAirplaneFlying == false
            System.out.println("The airplane is already on the ground.");
        }
    }

    public void flyingTo(int x, int y) { //method
        if (isAirplaneFlying) { // if isAirplaneFlying == true we set coordinates
            xCoordinate = x;
            yCoordinate = y;
            System.out.println("The airplane is now flying to coordinates (" + x + ", " + y + ").");
        } else { // if it's not true, then we are printing this
            System.out.println("The airplane needs to take off before it can fly to a destination.");
        }
    }

    public String getCurrentState() { //method that returns strings
        if (isAirplaneFlying) { // if isAirplaneFlying == true then first string
            return "The airplane is currently flying to coordinates (" + xCoordinate + ", " + yCoordinate + ").";
        } else { //isAirplaneFlying == false then this string
            return "The airplane is currently on the ground.";
        }
    }
}
