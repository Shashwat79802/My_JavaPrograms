package com.shashwat.Bitwise;

public class SetBits
{
    public static void main (String[] args) {

        int n = 2145687;
        System.out.println(Integer.toBinaryString(n));

        System.out.println("No. of set bit is: " + count_setbit(n));
    }

    static int count_setbit (int n) {

        int count = 0;

        while (n != 0) {

            count++;
            n = (n & (n - 1));
        }

        return count;
    }
}
