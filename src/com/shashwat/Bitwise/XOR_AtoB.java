package com.shashwat.Bitwise;

public class XOR_AtoB
{
    public static void main (String[] args) {

        int a = 3, b = 9;

        System.out.println("XOR of " + a + " to " + b + " is: " + (Xor(a-1) ^ Xor(b)));
    }

    static int Xor (int a) {

        if (a % 4 == 0)
            return a;

        if (a % 4 == 1)
            return 1;

        if (a % 4 == 2)
            return a+1;

        return 0;
    }
}
