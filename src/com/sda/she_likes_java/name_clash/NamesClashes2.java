package com.sda.she_likes_java.name_clash;

public class NamesClashes2 {
    public static void main(String[] args) {

        // referring our own Date class - the best solution
        Date myDate = new Date();

        // java.sql.Date - canonical class name
        java.sql.Date sqlDate = new java.sql.Date(100);

        // the same as 7 line
        com.sda.she_likes_java.name_clash.Date myDate2 = new com.sda.she_likes_java.name_clash.Date();

        // java.utilDate
        java.util.Date utilDate = new java.util.Date(1000);
    }
}