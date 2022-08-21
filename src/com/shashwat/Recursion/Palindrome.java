package com.shashwat.Recursion;

public class Palindrome
{
    public static void main(String[] args) {
        int n = 1243421;
        boolean palin = palindrome2(n);

        if (palin)
            System.out.println(n + " is palindrome");
        else
            System.out.println(n + " is not palindrome");
    }

//---------------------------------------------------------------------------------------------------------------------
    public static boolean palindrome1 (int n) {

        return reverse(n) == n;
    }
    public static int reverse (int n) {
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
//---------------------------------------------------------------------------------------------------------------------

    public static boolean palindrome2(int n) {

        int digits = (int)Math.log10(n) + 1;
        return checker(0, digits-1, String.valueOf(n));
    }

    public static boolean checker(int start, int end, String num) {

        if (start > end)
            return true;

        else if (num.charAt(start) == num.charAt(end)) {
            return checker(++start, --end, num);
        }

        return false;
    }
}
