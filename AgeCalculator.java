package com.durgaSoftwareUdemy;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        calculator cal = new calculator();
        cal.detail();

    }
}

class calculator {
    public void detail() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your Birth year ");
        int year = scr.nextInt();
        System.out.println("Enter your Birth month ");
        int month = scr.nextInt();
        System.out.println("Enter your Birth day ");
        int day = scr.nextInt();

        LocalDate l = LocalDate.of(year, month, day);

        if (year > 1950 && year < 2020) {
            if (l.isBefore(LocalDate.now())) {
                LocalDate now = LocalDate.now();
                Period diff = Period.between(now, l);
                System.out.println(" You are " + Math.abs(diff.getYears()) + " Years " + Math.abs(diff.getMonths()) + " Months " + Math.abs(diff.getDays()) + " Days  old ");

                long months = Math.abs(diff.getYears()) * 12 + Math.abs(diff.getMonths());
                System.out.println(" you are age in Months ");
                System.out.println(" you are " + months + " months and " + Math.abs(diff.getDays()) + " Days old ");

                long hoursYears = Math.abs(diff.getYears()) * 8760;
                long hoursMonths = Math.abs(diff.getMonths()) * 730;
                long hoursDays = Math.abs(diff.getDays()) * 24;
                long hours = hoursYears + hoursMonths + hoursDays;
                System.out.println(" you are age in Hours \n  Your are " + hours + " hours old ");

                long minuteYears = Math.abs(diff.getYears()) * 525600;
                long minuteMonths = Math.abs(diff.getMonths()) * 43800;
                long minuteDays = Math.abs(diff.getDays()) * 1440;
                long minutes = minuteYears + minuteMonths + minuteDays;
                System.out.println(" you are age in Minutes \n  Your are " + minutes + " Minutes old ");

                long secondYears = Math.abs(diff.getYears()) * 31536000;
                long secondMonths = Math.abs(diff.getMonths()) * 259200;
                long secondDays = Math.abs(diff.getDays()) * 86400;
                long seconds = secondYears + secondMonths + secondDays;
                System.out.println(" you are age in Seconds \n  Your are " + seconds + " Seconds old ");

            } else
                System.out.println(" Entered Date is Greater than Current Date ..");

        } else
            System.out.println("Enter the year Greater than 1949 and less than Current Year ");
    }
}