package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maps are like dictionaries");

        Map<String, Trousers> myJeans = new HashMap<>(); // type of the key: String, type of the value: Trousers
        // key: "my favorite jeans"
        // value: new Trousers("jeans", "big star")
        myJeans.put("my favorite jeans", new Trousers("jeans", "big star"));
        myJeans.put("my old ones", new Trousers("unknown material", "primark"));
        myJeans.put("my old ones", new Trousers("unknown material", "primark II"));

        Map<Person, Trousers> personsTrousers = new HashMap<>();
        personsTrousers.put(new Person("mariusz", "p."), new Trousers ("polish material", "primark"));
        personsTrousers.put(new Person("karolina", "p."), new Trousers ("polish material", "primark"));
    }
    //map example:
    //- contains values under the keys (value is represented by key)
    //- any type can be type of the key
    //- any type can be type of the value
}
