package com.hoanm.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTimeExample {

    public static void main(String[] args) {

        //Create instance of DateTime
        LocalDate localDate;
        LocalTime localTime;
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTime;

        //Get time present by method now()
        localDate = LocalDate.now();
        System.out.println(localDate);

        localTime = LocalTime.now();
        System.out.println(localTime);

        localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
