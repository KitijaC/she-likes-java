package com.sda.she_likes_java.sorting;

import java.util.Objects;

public class House implements Comparable<House> {
    private int numberOfRooms;
    private int numberOfFloors;
    private int numberOfBathrooms;

    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfRooms == house.numberOfRooms && numberOfFloors == house.numberOfFloors && numberOfBathrooms == house.numberOfBathrooms && Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRooms, numberOfFloors, numberOfBathrooms, address);
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", address='" + address + '\'' +
                '}';
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public String getAddress() {
        return address;
    }

    public House(int numberOfRooms, int numberOfFloors, int numberOfBathrooms, String address) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.numberOfBathrooms = numberOfBathrooms;
        this.address = address;
    }

    @Override
    public int compareTo(House o) {
        return numberOfBathrooms - o.numberOfBathrooms;
    }
}
