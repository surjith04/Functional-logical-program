package com.functionalprograms;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DaysOfWeek
{
    /*
    Calculating the day of the week and returning it in terms of single digits
    1 - Monday
    2 - Tuesday
    3 - Wednesday
    4 - Thursday
    5 - Friday
    6 - Saturday
    0 - Sunday

     */
    static void dayOfWeek (int d ,int m , int y)
    {
        int year = y - (14 - m) / 12;
        int x = year + (year / 4 ) - (year / 100) + (year/400);
        int month = m + 12 * ((14 - m ) / 12 ) - 2;
        int day = (d + x + 31 * month / 12) % 7;
        System.out.println(day);
    }
    public static void main(String[] args)
    {
        int d = Integer.valueOf(args[0]);
        int m = Integer.valueOf(args[1]);
        int y = Integer.valueOf(args[2]);

        dayOfWeek(d,m,y);
    }
}
