package com.shashwat.Patterns;

/*
        *****
        *****
        *****
        *****
        *****
*/

public class Pattern1
{
    public static void main (String[] args) {
        pat(4);
    }

    static void pat (int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

