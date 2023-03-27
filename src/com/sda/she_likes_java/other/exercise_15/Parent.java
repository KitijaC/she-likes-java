//Exercise 15.
//Create a Parent class containing the following variables:
//- first name
//- surname
//- address - (use the class Address)
//- firstChild (use class Person)
//- secondChild (use class Person)

package com.sda.she_likes_java.other.exercise_15;

import com.sda.she_likes_java.classes.Address;
import com.sda.she_likes_java.classes.Person;

public class Parent {
    String firstName;
    String lastName;
    Address address;
    Person firstChild;
    Person secondChild;

    public static void main(String[] args) {
        Address someAddress = new Address();
        someAddress.country = "Latvia";
    }
}
