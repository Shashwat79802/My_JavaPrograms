package com.shashwat.Independent;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in Celcius: ");
        float celsius = input.nextFloat();

        float fah = (celsius * 1.8f) + 32;

        System.out.println("The temperature is fahrenheit is: " + fah);

    }
}
