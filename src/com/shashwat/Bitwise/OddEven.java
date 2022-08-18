package com.shashwat.Bitwise;

import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n to find if odd/even: ");
        int n = in.nextInt();
        boolean ans = oddEven(n);

        if (ans){
            System.out.println("n is odd");
        }
        else
            System.out.println("n is even");
    }

    public static boolean oddEven(int n) {

        return ((n & 1) == 1);
    }
}
