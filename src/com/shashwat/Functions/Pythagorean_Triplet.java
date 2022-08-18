package com.shashwat.Functions;

import java.util.Scanner;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter numbs: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        if (triplet_check(a, b, c))
            System.out.println("The entered numbs are pythagorean triplet");
        else
        System.out.println("The entered numbs are not pythagorean triplet");
    }

    static boolean triplet_check(int a, int b, int c) {
        if (max(a, b, c) == a)
            return a*a == b*b + c*c;
        else if (max(a,b,c) == b)
            return b*b == a*a + c*c;
        else
            return c*c == a*a + b*b;
    }

    static int max(int a, int b, int c)
    {
        int max = 0;

        if (max < a)
            max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;

        return max;
    }
}
