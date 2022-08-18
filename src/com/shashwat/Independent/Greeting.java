package com.shashwat.Independent;

import java.util.Scanner;

public class Greeting
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inp.next();

        System.out.println("Hello " + name);
    }
}
