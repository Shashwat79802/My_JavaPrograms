package com.shashwat.Bitwise;

public class Onn_specifiedBit {

    public static void main(String[] args) {
        int n = 1000, pos = 3;
        n = binaryRepresentation(n);

        System.out.println(Integer.toBinaryString(On_Ith_bit(n, pos)));
    }

    private static int On_Ith_bit(int n, int pos) {

        int mask = 1;
        mask = mask<<(pos-1);
        return n^mask;
    }

    static int binaryRepresentation(int n) {

        int pow = 0, ans = 0;

        while (n != 0) {
            int ld = n % 10;
            ans += (ld * Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        return ans;
    }
}
