package com.example.demo.services;

import java.time.LocalDate;

public class DateCalculator {

    public static String calculateDate() {
        String[] date = LocalDate.now().toString().split("-"); //2022-2-15
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int dayDate = Integer.parseInt(date[2]);

        if (month < 3) {
            month = month + 12;
        }

        int h;
        int q = dayDate;
        int m = month;
        int j = year / 100;
        int k = year % 100;
        int d;

        h = q + (13*(m+1)) / 5 + k + k/4 + j/4 - 2*j % 7;
        d = ((h+5)%7) + 1;

        String dag = "";

        switch (d) {
            case 0 -> dag = "lørdag";
            case 1 -> dag = "søndag";
            case 2 -> dag = "mandag";
            case 3 -> dag = "tirsdag";
            case 4 -> dag = "onsdag";
            case 5 -> dag = "torsdag";
            case 6 -> dag = "fredag";
        }

        return dag;
    }
}
