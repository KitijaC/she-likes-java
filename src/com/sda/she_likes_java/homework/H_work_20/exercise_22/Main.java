//Exercise 22
//
//Create a shopping cart class.
//Add as a field an items variable of type List<Item> - to store products.
//Item is also the class to be created.
//It is to contain the following fields:
//- product name
//- product price.
//The shopping cart class should provide the following operations:
//- add product to basket
//- displaying products in the shopping cart
//- calculation of the total basket value.
//Create a Main class and check the operations of your classes.

package com.sda.she_likes_java.homework.H_work_20.exercise_22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCartItems = new ShoppingCart();

        Item book = new Item("Book", 10.40);
        Item pencil = new Item ("Pencil", 1.50);
        Item notebook = new Item ("Notebook", 5.85);

        shoppingCartItems.addItemToCart(book);
        shoppingCartItems.addItemToCart(pencil);
        shoppingCartItems.addItemToCart(pencil);
        shoppingCartItems.addItemToCart(pencil);
        shoppingCartItems.addItemToCart(notebook);
        shoppingCartItems.addItemToCart(notebook);

        shoppingCartItems.displayItems();
        System.out.println("");
        System.out.println("Total: EUR " + shoppingCartItems.calculateTotal());
    }
}
