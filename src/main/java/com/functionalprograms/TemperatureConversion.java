package com.functionalprograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConversion
{
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.##");


    /*
    Temperature Conversion is a function
    to calculate the temperature according to the user Need
    Whether to calculate Celcius or Farenheit
     */
    static void temperatureConversion(int typeOfConversion)
    {
        if(typeOfConversion == 1)
        {
            System.out.println("Enter Celcius");
            double v = scanner.nextDouble();
            double farenheit = (v * 9 / 5 ) + 32;
            System.out.println("Farenheit Value " + df.format(farenheit )+ " F ");
        }
        else
        {
            System.out.println("Enter Farenheit");
            double v = scanner.nextDouble();
            double celcius = (v - 32) * 5 / 9 ;
            System.out.println("Celcius Value " + df.format(celcius) + " C ");
        }

    }
    public static void main(String[] args) {


        System.out.println("Enter 1 to Celcius to Farenheit otherwise 0");
        int a = scanner.nextInt();
        temperatureConversion(a);
    }
}
