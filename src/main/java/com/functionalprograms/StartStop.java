package com.functionalprograms;

import java.util.Scanner;

public class StartStop
{
    /*
    function to calculate Runtime of a StopWatch
     */
    static void stopStart()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start to Start");
        scanner.next();
        double start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("Enter Stop to Stop");
        scanner.next();
        double end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Run time " + (end - start));
    }


    public static void main(String[] args)
    {
        System.out.println("Start And Start Watch");
        stopStart();

    }
}
