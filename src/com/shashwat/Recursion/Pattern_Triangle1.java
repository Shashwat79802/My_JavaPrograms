package com.shashwat.Recursion;

/*  0  1  2  3
4   *  *  *  *
3   *  *  *
2   *  *
1   *
 */

public class Pattern_Triangle1
{
    public static void main (String[] args) {

        int row = 4, col = 0;       //i.e. pointer is at 4th row and 0th column
        triangle(row, col);
    }

    static void triangle (int row, int col) {

        if (row == 0)
            return;

        if (col < row) {
            System.out.print("* ");
            triangle(row, col+1);
        }
        else {
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
