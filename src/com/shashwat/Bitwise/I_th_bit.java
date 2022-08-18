package com.shashwat.Bitwise;

public class I_th_bit
{
    public static void main(String[] args) {

        int n = 26;
        int bit = 5;

        System.out.println((n >> bit) & 1);
    }
}
