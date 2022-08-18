package com.shashwat.Independent;

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print('\n' + "Enter operation (+, -, *, /) : ");
        char ch = in.next().charAt(0);

        int num1, num2;

        System.out.print('\n' + "Enter num1: ");
        num1 = in.nextInt();

        System.out.print("Enter num2: ");
        num2 = in.nextInt();

        if (ch == '+')
        {
            int sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }
        else if (ch == '-')
        {
            int sub = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + sub);
        }
        else if (ch == '*')
        {
            int mul = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + mul);
        }
        else
        {
            float div = ((float)(num1) / num2);
            System.out.println(num1 + " / " + num2 + " = " + div);
        }
        }
}
