package com.shashwat.Independent;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.print("\nEnter operation: ");
            char op = in.next().trim().charAt(0);

            if ((op == '+') || (op == '*') || (op == '/') || (op == '-') | (op == '%'))
            {
                float num1, num2;
                System.out.print("\nEnter two no.s to perform the operation: ");
                num1 = in.nextFloat();
                num2 = in.nextFloat();

                if (op == '+')
                    System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));

                else if (op == '-')
                    System.out.print(num1 + " - " + num2 + " = " + (num1-num2) );

                else if (op == '*')
                    System.out.print(num1 + " * " + num2 + " = " + (num1*num2) );

                else if (op == '/')
                    System.out.print(num1 + " / " + num2 + " = " + (num1/num2) );

                else if (op == '%')
                    System.out.print(num1 + " % " + num2 + " = " + (num1%num2) );


            }
            else if ( op == 'x' || op == 'X')
                break;

            else
                System.out.println("Invalid Input, Try Again!!!");

        }
    }
}
