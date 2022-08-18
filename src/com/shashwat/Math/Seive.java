package com.shashwat.Math;

public class Seive
{
    public static void main (String[] args) {

        int n = 40;
        boolean[] notPrime = new boolean[n + 1];

        for (int i = 2; i*i <= n; i++) {

            if (!notPrime[i]) {

                for (int j = i*2; j <= n; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!notPrime[i])
                System.out.print(i + " ");
        }
    }
}
