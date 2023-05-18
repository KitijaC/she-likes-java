//Exercise 26
//Create an enumeration class named ImportantEvents.
//The class should contain the following fields:
//- Date of the event
//- Description of the event.
//Create at least 3 instances of the class to symbolise your important events.
//Create the class Main and in it:
//- call the values() method of your class
//- write out the contents of the created array (dates and description)

package com.sda.she_likes_java.homework.H_work_24.exercise_26;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        ImportantEvents[] allEvents = ImportantEvents.values();
        System.out.println("These are my important events in 2023: " + allEvents[0] + ", " + allEvents[1] + ", " + allEvents[2] );

        System.out.println("");
        ImportantEvents myEvents = ImportantEvents.GRADUATION;
        System.out.println("The first event is: " + myEvents);
        System.out.println("Date of this event is: " + myEvents.getDateOfTheEvent());
        System.out.println("And the description of this event: " + myEvents.getDescriptionOfTheEvent());

        System.out.println("");
        myEvents = ImportantEvents.BIRTHDAY;
        System.out.println("The second event is: " + myEvents);
        System.out.println("Date of this event is: " + myEvents.getDateOfTheEvent());
        System.out.println("And the description of this event: " + myEvents.getDescriptionOfTheEvent());

        System.out.println("");
        myEvents = ImportantEvents.CONCERT;
        System.out.println("The third event is: " + myEvents);
        System.out.println("Date of this event is: " + myEvents.getDateOfTheEvent());
        System.out.println("And the description of this event: " + myEvents.getDescriptionOfTheEvent());

    }
}
