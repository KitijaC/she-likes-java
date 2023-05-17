package com.sda.she_likes_java.enumerable;

// enum is class with restricted number of instances - u can  modify content but not the number of instances
public enum Seasons {
    WINTER(-5, "skiing"),
    SUMMER(25, "swimming"),
    SPRING(10, "running"),
    AUTUMN(5, "walking");

    private int averageTemp;
    private String activity;

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    private Seasons(int averageTemp, String activity) { // its private by default
        this.averageTemp = averageTemp;
        this.activity = activity;
    }
}
