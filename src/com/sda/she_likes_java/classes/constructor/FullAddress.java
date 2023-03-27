package com.sda.she_likes_java.classes.constructor;

public class FullAddress {
    public String country;
    public String city;
    public String street;
    public String postalCode;

    // constructor
    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    // default constructor - without any parameters
    public FullAddress() {
    }

    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // full address
        FullAddress myAddress =  new FullAddress();
        myAddress.city = "Valmiera";
        myAddress.country = "Latvia";
        myAddress.street = "street Saules 24";
        myAddress.postalCode = "LV-3266";
        System.out.println("FullAddress created by hand: " + myAddress);

        FullAddress createdWithFullConstructor = new FullAddress("Spain", "Madrid", "La", "2235-6");
        System.out.println("FullAddress created with constructor: " + createdWithFullConstructor);
    }
}
