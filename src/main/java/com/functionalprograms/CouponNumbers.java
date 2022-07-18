package com.functionalprograms;

import java.util.Random;
import java.util.Scanner;



public class CouponNumbers
{
    static String coupon = "";
    /*
    function to create a random number
     */
    static int randomNumber()
    {
        Random random = new Random();
        return (int) Math.ceil(Math.random() * 10 % 9);
    }
    /*
    function to create coupon number by concating the string with random number
     */
    static String couponNumber(int random)
    {
        coupon += String.valueOf(random);
        return coupon;
    }
    /*
    main function
     */
    public static void main(String[] args) {

        System.out.println("Coupon Numbers");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0 ; i < n ; i++)
        {
            int random = randomNumber();
            coupon =  couponNumber(random);
        }
        System.out.println("Your Coupon is " + coupon);
    }
}
