package com.functionalprograms;

import java.util.Scanner;

public class MonthlyPayment
{
    /*
     printing the Monthly Payment
     */

    static void calculatePayment(int P , double n , double r)
    {
        double payment = ((P * r ) / (1 - (Math.pow((1 + r),-(n)))));
        System.out.println("Interest is " + payment);
    }
    /*
    using command line arguments
    for assigning values for P,Y,R
     */
    public static void main(String[] args) {
        int P = Integer.valueOf(args[0]);
        int Y = Integer.valueOf(args[1]);
        float R = Integer.valueOf(args[2]);
        double n = 12 * Y;
        double r = R / (12 * 100);
        calculatePayment(P,n,r);
    }
}

