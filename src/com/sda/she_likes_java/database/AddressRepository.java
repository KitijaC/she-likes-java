package com.sda.she_likes_java.database;

import java.util.List;

public class AddressRepository {

    private static final String allAddressesQuery = """
            SELECT ID, CITY, STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            """;
    private static final String finalAddressById = """
            SELECT ID, CITY, STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            WHERE ID = %d  -- place for id of row
            """; // %d - some number, -- ignoring started from this line - like a comment
    private static final String findAddressesByCityAndCountry = """
            SELECT ID, CITY, STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            WHERE CITY = %s AND COUNTRY = %s 
            """; // %s - some string
    public static List<Address> getAllUsers() {
        return List.of();
    }
}
