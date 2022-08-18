package com.shashwat.Math;

public class LCM {
    public static void main(String[] args) {

        int a = 2, b = 6;
        int gcd = gcd (a, b);

        int lcm = (a * b) / gcd;        // LCM * HCF = a * b;
        System.out.println("LCM = " + lcm);
    }

    public static int gcd (int a, int b) {

        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}
