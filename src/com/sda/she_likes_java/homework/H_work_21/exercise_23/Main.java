//Exercise 23:
//Create a lesson journal:
//- it should provide 3 methods
//- provide a list of pupils
//- provide a list of subjects
//- provide the pupil’s grades in the subject.
//Think about what classes you will need.
//What structures will you use to store the data: list, map, set.

package com.sda.she_likes_java.homework.H_work_21.exercise_23;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("This is lesson journal:");
        System.out.println("");

        Map<Pupil, Subject> lessonJournal = new HashMap<>();
        lessonJournal.put(new Pupil("Elena", "Wilson"), new Subject("Mathematics", 8));
        lessonJournal.put(new Pupil("Ann", "Green"), new Subject("Mathematics", 10));
        lessonJournal.put(new Pupil("Eddy", "cooper"), new Subject("Mathematics", 5));
        lessonJournal.put(new Pupil("Robert", "Soho"), new Subject("Mathematics", 7));
        lessonJournal.put(new Pupil("Leona", "Lee"), new Subject("Mathematics", 7));
        lessonJournal.put(new Pupil("Elizabeth", "Wolf"), new Subject("Mathematics", 10));
        lessonJournal.put(new Pupil("Amanda Jade", "Jackie"), new Subject("Mathematics", 4));
        lessonJournal.put(new Pupil("Eric", "Monroe"), new Subject("Mathematics", 6));
        lessonJournal.put(new Pupil("Andy", "Mandy"), new Subject("Mathematics", 2));
        lessonJournal.put(new Pupil("Elvis", "Hunter"), new Subject("Mathematics", 10));
        lessonJournal.put(new Pupil("Eleonor Ann", "Stone"), new Subject("Mathematics", 9));

        displayLessonJournal(lessonJournal);
    }

    public static void displayLessonJournal(Map<Pupil, Subject> journalMap) {
        for (Map.Entry<Pupil, Subject> item : journalMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
