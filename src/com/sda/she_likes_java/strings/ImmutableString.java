package com.sda.she_likes_java.strings;

public class ImmutableString {

    public static void main(String[] args) {
        String name = "Kitija";
        name = name.concat("Cietvira"); // + is shortcut for concat method call
        name = name.concat("she is 27");
        System.out.println("My name is " + name);

        StringBuilder nameWithBuilder = new StringBuilder("Kitija");
        nameWithBuilder.append(" Cietvira");
        nameWithBuilder.append(" Cietvira");
        nameWithBuilder.append(" Cietvira");
        nameWithBuilder.append(" Cietvira");
        nameWithBuilder.append(" Cietvira");

        System.out.println("Name with builder: " + nameWithBuilder);
        String some = "Alice " + " is" + " 10" + " years";
        //"Alice is" + " 10" + " years"
        // "Alice is 10" + " years"
        // "Alice is 10 years"
        String alice = "Alice";

        StringBuilder someString = new StringBuilder();
        someString.append("Alice");
        someString.append("is");
        someString.append("10");
        someString.append("years");
    }
}
