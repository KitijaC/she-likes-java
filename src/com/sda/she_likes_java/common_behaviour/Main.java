package com.sda.she_likes_java.common_behaviour;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
//        bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Flyable superman = new Superman();
        Flyable flyableParrot = new Parrot();

        Swimmable tiger2 = (Swimmable) tiger; // cant access just tiger without (Swimmable) because Animal not swimming
        Swimmable swimmableSuperman = (Swimmable) superman;
        Swimmable swimmableTiger = new Tiger(); // accessing directly Tiger class

        Superman superSuperMan = new Superman();
        superSuperMan.fly();
        superSuperMan.swim();
        Flyable superFly = superSuperMan;
        superFly.fly();
        Swimmable superSwim = superSuperMan;

        // Tiger assignment ways
        Tiger newTiger = new Tiger(); // tiger class can access only tiger
        newTiger.go();
        newTiger.swim();
        Animal animalTiger = new Tiger();
        animalTiger.go();
        Swimmable swimmableTiger2 = new Tiger();
        swimmableTiger2.swim();
        Object objectTiger = new Tiger(); // cannot call go() and swim() - they are not visible here
    }
}
