package com.functionalprograms;

import java.util.*;

public class PerfectNumber
{
    /*
    function to calculate Perfect Number;
    for Example
    Let's take 28
    28 can be divisble by 1 , 2 ,  4 , 7 , 14  other than 28
    28 = 1 + 2 + 4 + 7 + 14
    28 = 28
    28 is a Perfect Number

     */
    static void findPerfectNumber(int number )
    {
        List<Integer> totalNumber = new ArrayList<>();
        for (int i = 1 ; i < number ; i++)
        {
            if ( number % i == 0)
            {
                totalNumber.add(i);
            }
        }
        int total = 0 ;
        for (int i = 0 ; i < totalNumber.size() ; i++)
        {
            total += totalNumber.get(i);
        }

        if ( number == total)
        {
            System.out.println(number + " is a Perfect Number ");
        }
        else
        {
            System.out.println(number + " is a not Perfect Number ");
        }

    }
    public static void main(String[] args) {
        System.out.println("Divisors");
        System.out.println("--------");
        System.out.println("Enter A Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        findPerfectNumber(number);
    }
}
