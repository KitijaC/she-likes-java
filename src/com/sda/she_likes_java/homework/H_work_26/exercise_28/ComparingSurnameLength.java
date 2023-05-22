package com.sda.she_likes_java.homework.H_work_26.exercise_28;

import java.util.Comparator;

public class ComparingSurnameLength implements Comparator<Name> {
    @Override
    public int compare(Name o1, Name o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
