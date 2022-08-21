package com.shashwat.Recursion;

class Sol {
    public static void main (String[] args) {  //9 7 6 15 17 5 10 11

        System.out.print(sumOfDigits(55505));
    }

    static int sumOfDigits (int n) {

        if (n == 0)
            return 1;

        return ((n%10) * sumOfDigits(n/10));
    }
}


