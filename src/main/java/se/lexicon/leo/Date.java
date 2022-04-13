package se.lexicon.leo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.util.List;

public class Date {

    public static void main(String[] args) {
        //1
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //2
        LocalDate april12 = LocalDate.parse("2022-03-29");
        String custom = april12.format(DateTimeFormatter.ofPattern("eeee dd MMM yyyy"));
        System.out.println(custom);
        //3
        LocalDate lastMonday = LocalDate.parse("2022-04-04");


    }

}
