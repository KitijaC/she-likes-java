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

public class ShoppingCart {

        List<Item> items = new ArrayList();

        public void addItemToCart(Item item) {
            items.add(item);
        }

        public void displayItems() {
            System.out.println("Items in the shopping cart:" + items);
            System.out.println("");
            System.out.println("Here is the list of the items: ");
            System.out.println("");
            for (Item item : items) {
                System.out.println(item.getName() + " - EUR " + item.getPrice());
            }
        }

        public double calculateTotal() {
            double total = 0;
            for (int i = 0; i < items.size(); i++) { // size method is the same as length in the arrays
                total += items.get(i).getPrice();
            }
//            for (Item item : items) {
//                total += item.getPrice();
//            }
            return total;
        }

}
