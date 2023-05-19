package com.sda.she_likes_java.time_and_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeAndDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is: " + currentDate);

        System.out.println("Current year is: " + currentDate.getYear());
        System.out.println("Current month is: " + currentDate.getMonth());
        System.out.println("Current day of the month is: " + currentDate.getDayOfMonth());

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current date and time in my location is: " + currentDateAndTime);

        System.out.println("Let's format a little bit our date and time");
        System.out.println(currentDateAndTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        // DON'T USE THIS!!
        Date oldDate = new Date();
        oldDate.setTime(100 * 60 * 60 *24);

        LocalDate now = LocalDate.now();
        LocalDate future = now.plus(5, ChronoUnit.DAYS);
        System.out.println("date is: " + now);
        System.out.println("future is: " + future);
        LocalDate previousYear = now.minusYears(1);
        System.out.println("previous year: " + previousYear);
        boolean isBefore = previousYear.isBefore(now);
        System.out.println("previous year is before now: " + isBefore);
    }
}
