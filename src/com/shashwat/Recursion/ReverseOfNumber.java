package com.shashwat.Recursion;

public class ReverseOfNumber {

    public static void main (String[] args) {

        int n = 1234;
        System.out.println("Reverse of " + n + " is: " + reverse2(n));
    }

    public static int reverse1 (int n, int rev) {

        rev += (n % 10);
        n /= 10;

        if (n % 10 == n)
            return (rev*10 + n);

        return reverse1(n, rev *= 10);
    }
//_________________________________________________________________________________________________________________

    public static int reverse2 (int n) {
        //we'll count the no. of digits in n, and pass n and no. of digits
        //in a helper function, where we'll reverse the no.

        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {

        if (n%10 == n)
            return n;

        int rem = n % 10;

        return ((rem * (int)Math.pow(10, digits - 1)) + helper(n / 10, digits - 1));
    }
}
