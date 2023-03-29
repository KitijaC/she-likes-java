////Exercise 16
////Create a hierarchy of classes:
////use a separate package: exercise_16
////new Owner class with private fields
////First name
////surname,
////Animal
////class Animal containing the fields
////first name
////age
////breed
////Use private variables and create get/set methods
////Create a toString() method for each class.
////Create a main method and a sample class hierarchy.

package com.sda.she_likes_java.homework.H_work_13.exercise_16;

public class Homework {
    public static void main(String[] args) {

        Owner owner = new Owner();
        Animal animal = new Animal();

        owner.setFirstName("Kitija");
        owner.setSurname("Cietvira");
        owner.setAnimal(animal);

        animal.setName("Domino");
        animal.setBreed("Jack Russel Terrier");
        animal.setAge(3);

        System.out.println(owner.toString());
    }
}
