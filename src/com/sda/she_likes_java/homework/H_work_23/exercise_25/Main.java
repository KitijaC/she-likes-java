
//Exercise 25

// Create the Cities Countries class
//- class should have the following methods
//- give names of countries
//- give the cities in given country
//- use appropriate structures to hold the data
//Create a Main class to test your class

package com.sda.she_likes_java.homework.H_work_23.exercise_25;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CountryAndCities> countryAndCityNames = new ArrayList<>();
        countryAndCityNames.add(new CountryAndCities("Latvia", "Riga"));
        countryAndCityNames.add(new CountryAndCities("Lithuania", "Vilnius"));
        countryAndCityNames.add(new CountryAndCities("Estonia", "Tallinn"));
        countryAndCityNames.add(new CountryAndCities("Poland", "Warshaw"));
        countryAndCityNames.add(new CountryAndCities("Greece", "Athens"));


        System.out.println("These are countries with cities: " + countryAndCityNames);
    }
}
