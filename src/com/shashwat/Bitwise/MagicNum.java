package com.shashwat.Bitwise;
import java.util.Scanner;

public class MagicNum {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n to get it's magic no.: ");
        int n = in.nextInt();
        int ans = 0, base = 5;

        while (n > 0) {

            int last = n & 1;
            ans += (last * base);
            base *= 5;
            n = n >> 1;
        }

        System.out.printf("Magic no. is %d", ans);
    }
}
