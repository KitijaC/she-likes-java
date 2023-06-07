package com.sda.she_likes_java.homework.H_work_29.exercise_31;

public interface Calculator {

    default int add(int first, int second) {
        return first + second;
    }

    default int sub(int first, int second) {
        return first - second;
    }

    default int div(int first, int second) {
        return first / second;
    }

    int mult(int first, int second);

}
