package com.sda.she_likes_java.homework.H_work_23.exercise_25;

public class CountryAndCities {

    private final String countryName;
    private final String nameOfCityInTheCountry;

    public CountryAndCities(String countryName, String nameOfCityInTheCountry) {
        this.countryName = countryName;
        this.nameOfCityInTheCountry = nameOfCityInTheCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getNameOfCityInTheCountry() {
        return nameOfCityInTheCountry;
    }

    @Override
    public String toString() {
        return "CountryAndCities{" +
                "countryName='" + countryName + '\'' +
                ", nameOfCityInTheCountry='" + nameOfCityInTheCountry + '\'' +
                '}';
    }
}
