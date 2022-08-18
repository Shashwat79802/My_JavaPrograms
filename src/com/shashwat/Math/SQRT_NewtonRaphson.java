package com.shashwat.Math;

public class SQRT_NewtonRaphson
{
    public static void main (String[] args) {

        int n = 40;

        System.out.println("Sqrt of " + n + " is : " + sqrt(n));
    }

    static double sqrt (int n) {

        double x = n;          // x is the guess
        double root;

        while (true) {

            root = 0.5 * (x + n/x);

            if (Math.abs(root - x) < 0.5)          //root - x = error and error < 0.5
                break;

            x = root;
        }
        return root;
    }
}
