package com.shashwat.Independent;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter num1: ");
        num1 = input.nextInt();

        System.out.print("Enter num2: ");
        num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: "+ sum);
    }
}