//Exercise 14
//Create class with name Address
//Put next variables inside it:
//- country,
//- city,
//- street
//- postal code
//Use proper data types.
//Try to create two different addresses objects and init them with some values.

package com.sda.she_likes_java.homework.H_work_11;

import com.sda.she_likes_java.homework.H_work_11.Address;

public class Homework11 {
    public static void main(String[] args) {

        Address school = new Address();
        school.country = "Latvia";
        school.city = "Talsi";
        school.street = "street Skolas 3";
        school.postalCode = 3261;

        Address hospital = new Address();
        hospital.country = "Latvia";
        hospital.city = "Ventspils";
        hospital.street = "street Saules 12";
        hospital.postalCode = 3220;

        System.out.println("My school address is: " + school.country + ", " + school.city + ", " + school.street + ", LV-" + school.postalCode);
        System.out.println("Address of the nearest hospital is: " + hospital.country + ", " + hospital.city + ", " + hospital.street + ", LV-" + hospital.postalCode);

    }
}
