package com.shashwat.Independent;

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        float p, r, t;

        System.out.print("Enter principal amount: ");
        p = inp.nextFloat();

        System.out.print("Enter rate of interest: ");
        r = inp.nextFloat();

        System.out.print("Enter time: ");
        t = inp.nextFloat();

        double SI = (p*r*t)/100;

        System.out.println("Simple Interest is "+ SI);
    }
}
