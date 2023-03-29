package com.sda.she_likes_java.homework.H_work_13.exercise_16;

public class Owner {
    private String firstName;
    private String surname;
    private Animal animal;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", animal=" + animal +
                '}';
    }
}
