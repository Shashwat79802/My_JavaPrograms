package com.shashwat.Independent;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int num1, num2, rev = 0;

        System.out.print("\nEnter no. to check palindrome: ");
        num1 = in.nextInt();
        
        num2 = num1;
        
        while (num1 != 0)
        {
            int a = num1 % 10;
            rev = rev * 10 + a;
            num1 /= 10;
        }

        if (num2 == rev)
        {
            System.out.print("\nYes, it is a palindrome no.");
        }
        else{
            System.out.print("\nNo, it is not a palindrome no.");
        }
        System.out.println("\n");
    }
}
