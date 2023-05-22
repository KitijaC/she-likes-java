package com.sda.she_likes_java.homework.H_work_26.exercise_28;

import java.util.Objects;

public class Name implements Comparable<Name> {
    private String firstName;
    private String surname;

    public Name(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(surname, name.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }


    @Override
    public int compareTo(Name o) {
        return firstName.length() - o.firstName.length();
    }
}
