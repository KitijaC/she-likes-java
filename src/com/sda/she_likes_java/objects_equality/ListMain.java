package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Object> personObjects = new ArrayList();
        List personList = new ArrayList();

        Person me = new Person("Kitija", "Cietvira", 27);
        Person you = new Person("Ann", "Green", 44);
        Person other = new Person("Emily", "Lockwood", 20);

        personList.add(me);
        personList.add(you);
        personList.add(other);
        personList.add(new Car("BLUE"));


        System.out.println(personList);

        System.out.println("Try to get person out of the List");
        System.out.println("Person form the List: " + personList.get(1));
        Person personFromList = (Person) personList.get(1); // casting
        Object fromPosition0 = personList.get(0);
        System.out.println("age of the person fromPosition0: " + ((Person) fromPosition0).getAge());

        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        Person fromTheList = betterPersonList.get(0);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pink"));
        System.out.println("Car color is: " + cars.get(0).color);

//        cars.add(me);
    }
}
