//Exercise 16
//Create a hierarchy of classes:
//use a separate package: exercise_16
//new Owner class with private fields
//First name
//surname,
//Animal
//class Animal containing the fields
//first name
//age
//breed
//Use private variables and create get/set methods
//Create a toString() method for each class.
//Create a main method and a sample class hierarchy.

package com.sda.she_likes_java.homework.H_work_13.exercise_16;

public class Owner {
    private String firstName;
    private String surname;
    private Animal animal;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

//    public Owner(String firstName, String surname, Animal animal) {
//        this.firstName = firstName;
//        this.surname = surname;
//        this.animal = animal;
//    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", animal=" + animal +
                '}';
    }

    public static void main(String[] args) {
//        Animal animal = new Animal("Domino", 3, "Jack Russel Terrier");
//        Owner owner = new Owner("Kitija", "Cietvira", animal);
        Owner owner = new Owner();
        owner.firstName = "Kitija";
        owner.surname = "Cietvira";
        Animal animal = new Animal();
        animal.setName("Domino");
        animal.setBreed("Jack Russel Terrier");
        animal.setAge(3);

//        System.out.println("Hierarchy of classes: " + owner);
        System.out.println("Owner is: " + owner.toString() + " dog is: " + animal.toString());
        System.out.println("Hello, my name is " + owner.getFirstName() + " "
                + owner.surname + " and I have a " + animal.getBreed() +
                ". His name is " + animal.getName() +
                " because he looks like a piece of the Domino game - " +
                "he is white with three black dots on the back. He is already " +
                animal.getAge() + " years old. Actually he celebrated his birthday three days ago.");
    }
}
