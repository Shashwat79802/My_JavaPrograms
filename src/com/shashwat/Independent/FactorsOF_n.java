package com.shashwat.Independent;

import java.util.Scanner;

public class FactorsOF_n
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no. to display it's factors: ");
        int n = in.nextInt();

        System.out.print("\nThe factors Of " + n + " are: ");
        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
