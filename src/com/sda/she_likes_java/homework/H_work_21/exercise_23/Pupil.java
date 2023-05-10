package com.sda.she_likes_java.homework.H_work_21.exercise_23;

import java.util.Objects;

public class Pupil {
    private final String name;
    private final String Surname;

    public Pupil(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
