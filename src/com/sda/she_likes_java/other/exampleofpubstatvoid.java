package com.sda.she_likes_java.other;

import java.util.ArrayList;
import java.util.List;

//this code just explains the difference between public static void and public void
public class exampleofpubstatvoid {
    private static int a;
    private int b;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karolina");
        names.add("Ramune");

        exampleofpubstatvoid one = new exampleofpubstatvoid();
        one.b = 5;
        exampleofpubstatvoid two = new exampleofpubstatvoid();
        two.b = 7;

        System.out.println(one.a);
        System.out.println(two.b);
        printNames(names);
    }

    public static void printNames(List<String> names) {

    }
}
