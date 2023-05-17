package com.sda.she_likes_java.enumerable;

import java.util.List;

public class SeasonsExample {
    public static void main(String[] args) {
        // Person me = new Person();
        // Person me1 = new Person();
        // Person me2 = new Person();
        // Person me3 = new Person(); // for enums u cant do this, u have only those 4 instances that are created
        Seasons myFavoriteOne = Seasons.SUMMER;
        System.out.println("Average temperature during summer is: " + myFavoriteOne.getAverageTemp());
        System.out.println("Summer's activity: " + myFavoriteOne.getActivity());
        myFavoriteOne.setActivity("swimming");
        System.out.println("Summer's activity: " + myFavoriteOne.getActivity());

        Seasons autumn = Seasons.AUTUMN;

        System.out.println("summer: " + myFavoriteOne);

        List<Seasons> seasonsLIst = List.of(
                Seasons.WINTER,
                Seasons.AUTUMN
        );
    }
}
