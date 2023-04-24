package com.sda.she_likes_java.virtual_methods;

public class Main {
    public static void main(String[] args) {
        Mammal human = new Human(); // upcasting
        human.whoYouAre();

        Human nullHuman = null;

        HumanLife humanLife = new HumanLife();
        humanLife.tellMeWhoYouAre(nullHuman);

        Woman woman = new Woman();
        humanLife.tellMeWhoYouAre(woman);

        Man man = new Man();
        humanLife.tellMeWhoYouAre(man);

        System.out.println("Casting objects");
        Human anotherWoman = new Woman();
        Woman castedFromHuman = (Woman) anotherWoman; // same as humanLife 23 line
        castedFromHuman.learnJava(); // same as humanLife 23 line
        Man manForSure = new Man();
        Human anotherMan = manForSure; // Human anotherMan = Man(); every man is a human, but not  every human is a man
//        humanLife.tryToCastHumanToMan(anotherMan);
//        humanLife.tryToCastHumanToMan(new Man());
        humanLife.tryToCastHumanToMan(new Woman());
    }
}
