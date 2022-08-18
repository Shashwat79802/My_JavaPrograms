package com.shashwat.Math;

public class GCD_HCF
{
    public static void main (String[] args) {
        System.out.println("GCD = " + gcd(224, 105));
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }
}
