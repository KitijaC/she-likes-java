//Exercise 17
//Create a Book Lending application
//This contains a book class with the following fields
//- author
//- title
//- year of publication
//Create 3 different books at the beginning and then a random number of them.
//To create a random number of objects, use the “Random” class and a loop that will execute as many times as the nextInt() method returns.
//At the very end, write out the number of books created - use a variable of type “static”.

package com.sda.she_likes_java.other.exercise_17;

import java.time.Year;
import java.util.Random;

public class BookLendingLibrary {
    public static void main(String[] args) {
        System.out.println("Let’s create some books");
        createBourneTrilogy();

        //added examples later how to create many books - not related to this homework conditions
        System.out.printf("Number of copies of all books: [%d]%n", Book.getNumberOfCreatedBooks());

        //added examples later how to create many books - not related to this homework conditions
        Book[] createdArray = createBourneTrilogyAndStoreItInArray();
        Book toCopy = new Book("Bourne Ultimatum", "Robert Ludlum", Year.of(1990));
        Book[] twoBooks = createCopyOfBook(toCopy);
        System.out.println("First copy of book: " + twoBooks[0]);
        System.out.println("Second copy of book: " + twoBooks[1]);
        System.out.printf("Number of copies of all books: [%d]%n", Book.getNumberOfCreatedBooks());
    }
    public static void createBourneTrilogy() {
        Random random = new Random();
        int numberOfIterations = random.nextInt();
        for (int i = 0; i < numberOfIterations; i++) {
            new Book("Bourne Identity", "Robert Ludlum", Year.of(1980));
            new Book("Bourne Supremacy", "Robert Ludlum", Year.of(1986));
            new Book("Bourne Ultimatum", "Robert Ludlum", Year.of(1990));
        }
    }

    //added examples later how to create many books - not related to this homework conditions
    public static Book[] createCopyOfBook(Book bookToCopy) {
        Book[] bookShelf = new Book[2];
        bookShelf[0] = new Book(bookToCopy.getTitle(), bookToCopy.getAuthor(), bookToCopy.getYearOfPublication());
        bookShelf[1] = new Book(bookToCopy.getTitle(), bookToCopy.getAuthor(), bookToCopy.getYearOfPublication());
        return bookShelf;
    }

    public static Book[] createBourneTrilogyAndStoreItInArray() {
        Random random = new Random();
        int numberOfIterations = random.nextInt(1024);
        Book[] books = new Book[numberOfIterations];
        for (int i = 0; i < numberOfIterations; i++) {
            books[i] = new Book("Bourne Identity", "Robert Ludlum", Year.of(1980));
        }

        return books;
    }
}
