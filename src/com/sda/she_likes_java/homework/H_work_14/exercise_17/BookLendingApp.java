//Exercise 17
//Create a Book Lending application
//This contains a book class with the following fields
//- author
//- title
//- year of publication
//Create 3 different books at the beginning and then a random number of them.
//To create a random number of objects, use the “Random” class and a loop that will execute as many times as the nextInt() method returns.
//At the very end, write out the number of books created - use a variable of type “static”.

package com.sda.she_likes_java.homework.H_work_14.exercise_17;

import java.util.Random;

public class BookLendingApp {
    public static void main(String[] args) {
        Book romantic = new Book("Ann Green", "Butterflies", 2002);
        Book fantasy = new Book("Martin Lockwood", "Creatures in the Woods", 1980);
        Book history = new Book("Noel Del", "About 1950", 2014);

        Random randomBooks = new Random();
        int randomNumOfBooks = randomBooks.nextInt(100) + 1;

        for (int i = 0; i < randomNumOfBooks; i++) {
            Book book = new Book("Author " + i, "Title " + i, 2000 + i);
        }

        System.out.println("Number of books created: " + Book.getNumberOfBooks());

    }
}
