package com.pluralsight;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDateTime rightNow = LocalDateTime.now();

        DateTimeFormatter usa = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate todaysDate = LocalDate.now();
        DateTimeFormatter dayYear = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy  HH:mm");

        System.out.println(rightNow.format(usa));
        System.out.println(todaysDate);
        System.out.println(rightNow.format(dayYear));


        //challenge
        DateTimeFormatter onlyTime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter onlyDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println("\nChallenge");
        String part1 = rightNow.format(onlyTime);
        String part2 = rightNow.format(onlyDate);
        System.out.println(part1 + " on " + part2);



        }
    }
