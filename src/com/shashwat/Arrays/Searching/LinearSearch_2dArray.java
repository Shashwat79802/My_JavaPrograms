package com.shashwat.Arrays.Searching;

public class LinearSearch_2dArray
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {10,11,12,13}
                      };
        int[] index = search_2dArray(arr, 8);
        if (index[0]==-1)
            System.out.println("\nElement not found!!!");
        else if (index[0]==-2)
            System.out.println("\nEmpty Array!!!");
        else
            System.out.println("\nTarget element is in index ["+index[0]+"]["+index[1]+"]");
    }

    static int[] search_2dArray(int[][] arr, int target)
    {

        if(arr.length==0) {
            return new int[]{-2, 0};
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++) {
                if (arr[row][col] == target) {
                   return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, 0};
    }
}
