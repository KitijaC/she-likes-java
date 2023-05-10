package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Trousers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        a = 6;

        final int b = 7; // final value, can't change it after
//        b = 8; // this is not working

        // expandable list
        List<Trousers> trousers = new ArrayList<>(); // we use lists if we care about the order of items
        trousers.add(new Trousers("jeans", "big star"));
        trousers.add(new Trousers("jeans", "primark"));

        showItemsFromTheListList(trousers);
        //let's add another item to the list
        trousers.add(new Trousers("jeans", "primark"));

        // frozen list
        List<Trousers> trousersList = List.of( //limited number of items, cant add more of items
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );

        showItemsFromTheListList(trousersList);
//        trousersList.add(new Trousers("jeans", "primark")); // can't do this

        List<Trousers> trousersList2 = List.of( // completely different list of items
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "primark"),
                new Trousers("jeans", "primark"),
                new Trousers("jeans", "primark")
        );
    }

    public static void showItemsFromTheListList (List<Trousers> items) {
        // enhanced for loop
        for (Trousers currentItem: items) { // right side - collection (list name), left side - (list type and variable name) in every iteration had every value from collection
            System.out.println(currentItem);
        }

        // old loop
        for (int i = 0; i < items.size(); i++) {
            Trousers currentItem = items.get(i);
            System.out.println(currentItem);
        }
    }
}
