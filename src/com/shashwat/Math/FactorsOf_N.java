package com.shashwat.Math;

import java.util.ArrayList;

public class FactorsOf_N {

    public static void main (String[] args) {
        int n = 36;
        factors_of(n);
    }

    static void factors_of (int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print( list.get(i) + " ");
        }
    }
}
