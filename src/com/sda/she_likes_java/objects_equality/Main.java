package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 1;
        int c = 5;

        System.out.println("are a and b equal?: " + (a == b));
        System.out.println("are a and c equal?: " + (a == c));

        String name1 = new String("Ann");
        String name2 = new String("Ann");
        System.out.println("name1 == name2: " + (name1 == name2));
        String name3 = name2;
        System.out.println("name2 == name3: " + (name2 == name3));


        Person first = new Person("Ann", "Green", 28);
        Person second = new Person("Ann", "Green", 28);
        Person third = second;

        System.out.println("first == second: " + (first == second));
        System.out.println("first is equal to second: " + (first.equals(second)));
        System.out.println("third is equal to second: " + (third.equals(second)));
    }
}
