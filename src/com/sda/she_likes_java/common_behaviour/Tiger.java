package com.sda.she_likes_java.common_behaviour;

public class Tiger extends Animal implements Swimmable {
    @Override
    public void go() {
        System.out.println("Go() from Tiger");
    }

    @Override
    public void swim() {
        System.out.println("Tigers are great swimmers");
    }
}
