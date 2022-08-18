//This method is used if the array is sorted row-wise and col-wise....

package com.shashwat.Arrays.Searching;

import java.util.Arrays;

public class Search_2dArray
{
    public static void main (String[] args){

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {18, 28, 38, 48},
                {21, 31, 41, 51}
        };

        System.out.println(Arrays.toString(Search(arr, 100)));
    }

    static int[] Search(int[][] mat, int target){

        int row = 0, col = mat.length-1;

        while (row < mat.length && col >= 0){

            if (mat[row][col] == target)
                return new int[] {row, col};

            else if (mat[row][col] < target)
                row++;
            else
                col--;
        }
        return new int[] {-1, -1};
    }

}
