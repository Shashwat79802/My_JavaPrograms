package com.shashwat.Bitwise;

public class PowerOf_2 {
    public static void main(String[] args) {

        int n = 3;  // for n = 0, return false

        boolean ans = ((n & (n-1)) == 0);

        System.out.println(ans);
    }
}
