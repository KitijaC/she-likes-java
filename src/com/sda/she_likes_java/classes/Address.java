package com.sda.she_likes_java.classes;

public class Address {
    public String country;
    public String city;
    public String street;
    public String postalCode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address myFirstAddress = new Address();
        myFirstAddress.country = "Poland";
        myFirstAddress.city = "Warsaw";

        Address mySecondAddress = new Address();
        mySecondAddress.country = "Poland";
        mySecondAddress.city = "Rzeszow";

        System.out.println("City from first address: " + myFirstAddress.city);
        System.out.println("City from second address: " + mySecondAddress.city);
        System.out.println(myFirstAddress);
        System.out.println(mySecondAddress);

    }
}
