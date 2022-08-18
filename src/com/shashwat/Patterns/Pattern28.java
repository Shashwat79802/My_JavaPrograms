package com.shashwat.Patterns;

/*
            *
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *
      *   *   *   *
        *   *   *
          *   *
            *
 */
public class Pattern28
{
    public static void main (String[] args) {

        pat(5);
    }

    static void pat (int n) {

        int i = 2;

        for (int row = 1; row <= 2 * n - 1; row++) {

            int spaceLimit = (row <= n) ? (n - row) : (row - n);

            for (int spaces = 1; spaces <= spaceLimit; spaces++) {

                System.out.print("  ");
            }

            if (row <= n) {
                for (int col = 1; col <= row; col++) {

                    System.out.print("*   ");
                }
            }
            else {

                for (int col = row - i; col > 0 ; col--) {

                    System.out.print("*   ");
                }
                i += 2;
            }
            System.out.println();
        }
    }
}
