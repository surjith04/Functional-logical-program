package com.functionalprograms;

import java.util.Scanner;

public class PrimeNumber
{
    /*
    function to find a number if prime or not
     */
    static void findPrimeNumber(int n)
    {
        boolean flag = false;
        if ( n == 0 || n == 1)
        {
            System.out.println(n + "is not a Prime Number");
        }
        else
        {
            for (int i = 2 ; i <= n/2 ; i++)
            {
                if ( n % i == 0) { flag = true ; }
            }
        }
        if (!flag)
        {
            System.out.println(n + " is a Prime Number");

        }
        else
        {
            System.out.println(n + " is not a Prime Number");
        }
    }
    /*
    main function to get i/p from the user
     */
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        findPrimeNumber(n);
    }
}
