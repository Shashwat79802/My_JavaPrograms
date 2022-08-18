package com.shashwat.Patterns;

/*
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
 */

public class Pattern30
{
    public static void main(String[] args) {
        pat(6);
    }

    static void pat (int n) {

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
