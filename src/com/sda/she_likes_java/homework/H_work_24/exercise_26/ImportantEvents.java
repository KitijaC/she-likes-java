package com.sda.she_likes_java.homework.H_work_24.exercise_26;

public enum ImportantEvents {

    GRADUATION("12.06.2023", "The graduation in University."),
    CONCERT("22.08.2023", "Lewis Capaldi concert in Riga."),
    BIRTHDAY("09.07.2023", "It's finally my birthday!");

    private String dateOfTheEvent;
    private String descriptionOfTheEvent;

    public String getDateOfTheEvent() {
        return dateOfTheEvent;
    }

    public String getDescriptionOfTheEvent() {
        return descriptionOfTheEvent;
    }

    ImportantEvents(String dateOfTheEvent, String descriptionOfTheEvent) {
        this.dateOfTheEvent = dateOfTheEvent;
        this.descriptionOfTheEvent = descriptionOfTheEvent;
    }
}
