package com.functionalprograms;

import java.net.InetSocketAddress;
import java.util.Scanner;

public class Fibonacci
{
    /*
    funtion to calculate FibonacciSeries with n as argument
     */
    static void calculateSeries(int n)
    {
        int first = 0 ;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2 ; i < n ; i++)
        {
            int next = first + second ;
            System.out.println(next);
            first = second ;
            second = next ;
        }
    }
    /*
    main function to get input form user
     */
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("Enter N Value");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        calculateSeries(n);

    }
}
