/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int num1, num2, num3, largestNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        if (num1 != num2 && num1 != num3 && num2 != num3)
        {
            largestNum = num1;

            if (num2 > largestNum)
                largestNum = num2;

            if (num3 > largestNum)
                largestNum = num3;

            System.out.printf("The largest number is " + largestNum + ".");
        }
    }
}