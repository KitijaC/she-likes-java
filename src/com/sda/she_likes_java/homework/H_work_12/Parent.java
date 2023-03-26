//Exercise 15.
//Create a Parent class containing the following variables:
//- first name
//- surname
//- address - (use the class Address)
//- firstChild (use class Person)
//- secondChild (use class Person)
package com.sda.she_likes_java.homework.H_work_12;

public class Parent {
    String firstName;
    String parentSurname;
    Address homeAddress;
    Person firstChild;
    Person secondChild;

    public static void main(String[] args) {

        Parent mother = new Parent();
        mother.firstName = "Ann";
        mother.parentSurname = "Green";

        Address homeAddress = new Address();
        homeAddress.country = "Latvia";
        homeAddress.city = "Talsi";
        homeAddress.street = "street Saules";
        homeAddress.postalCode = "LV-3262";

        Person firstChild = new Person();
        firstChild.name = "Adeline";
        firstChild.surname = "Green";
        firstChild.age = 15;

        Person secondChild = new Person();
        secondChild.name = "Gabriel";
        secondChild.surname = "Green";
        secondChild.age = 10;

        System.out.println("Hi, my name is " +
                mother.firstName + " " +
                mother.parentSurname + " and our home address is " +
                homeAddress.country + ", " + homeAddress.city + ", " +
                homeAddress.street + ", " + homeAddress.postalCode +
                ". I am a parent of two children.");
        System.out.println("The name of my first child is " +
                firstChild.name + " " + firstChild.surname +
                " and she is " + firstChild.age + " years old.");
        System.out.println("The name of my second child is " +
                secondChild.name + " " + secondChild.surname +
                " and he is " + secondChild.age + " years old.");
    }

}
