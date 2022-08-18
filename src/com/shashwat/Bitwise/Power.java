package com.shashwat.Bitwise;

public class Power
{
    public static void main (String[] args) {

        int base = 10, power = 2;         //a^b
        int ans = 1;

        while (power > 0) {

            boolean shift = ((power & 1) == 1);

            if (shift){
                ans *= base;
            }
            base = base * base;
            power = power >> 1;
        }

        System.out.println("base ^ power = " + ans);
    }
}
