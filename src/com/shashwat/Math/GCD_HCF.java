package com.shashwat.Math;

public class GCD_HCF
{
    public static void main (String[] args) {

        int a = 224, b = 105;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM = " + lcm);
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }
}
