package com.shashwat.Patterns;

/*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

 */
public class Pattern5
{
    public static void main(String[] args) {
        pat(5);
    }

    static void pat (int n) {

        int i = 1;
        boolean lower = false;
        for (int row = 1; row <= 2 * n - 1; row++) {

            if (!lower){
                for (int col = 1; col <= row; col++) {

                    System.out.print("* ");
                }
                if (i == n) {
                    lower = true;
                }
                else i++;
            }

            else {
                i--;
                for (int col = 1; col <= i; col++){

                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

}
