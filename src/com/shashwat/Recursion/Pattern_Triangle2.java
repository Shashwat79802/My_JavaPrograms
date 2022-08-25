package com.shashwat.Recursion;

/*  1  2  3  4  5
5   *
4   *  *
3   *  *  *
2   *  *  *  *
1   *  *  *  *  *
 */


public class Pattern_Triangle2
{
    public static void main (String[] args) {

        int row = 5, col = 0;         //pointer is at row = 5, col = 1
        triangle(row, col);
    }

    public static void triangle (int row, int col) {

        if (row == 0)
            return;

        if (col < row) {
            triangle(row, col+1);
            System.out.print("* ");
        }
        else {
            triangle(row-1, 0);
            System.out.println();
        }
    }
}
