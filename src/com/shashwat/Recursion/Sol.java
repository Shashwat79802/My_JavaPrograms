package com.shashwat.Recursion;

import java.util.*;

class Sol {
    public static void main (String[] args) {  //9 7 6 15 17 5 10 11

        System.out.print(pow(2, 3));
    }

    static double pow(double x, int n) {

        if (n == 1)
            return  x;

        return (x * pow(x, n-1));
    }

}


