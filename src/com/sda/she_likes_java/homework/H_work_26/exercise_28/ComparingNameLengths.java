package com.sda.she_likes_java.homework.H_work_26.exercise_28;

import java.util.Comparator;

public class ComparingNameLengths implements Comparator<Name> {

    @Override
    public int compare(Name o1, Name o2) {
        String firstPersonFirstName = o1.getFirstName();
        String secondPersonFirstName = o2.getFirstName();
        return firstPersonFirstName.length() - secondPersonFirstName.length();
    }
}
