package com.functionalprograms;
import java.util.Scanner;

public class ReverseNumber
{
    static int reverseValue = 0;
    /*
    Funtion to calculate and return the reverse Number
     */
    static int reverseNumber(int n)
    {
        int reverse = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        return reverse;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        System.out.println("The reverse of the given number is: " + reverseNumber(number));
    }
}
