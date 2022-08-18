package com.shashwat.Arrays.ArrayCodes;

public class Max_Min_2dArray
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {45,56,21,36},
                {65},
                {23,28,17},
                {29,37,81}
        };
        System.out.println("The max in the array is: "+Max_in2dArray(arr));
        System.out.println("The min in the array is: "+Min_in2dArray(arr));
    }

    static int Max_in2dArray(int[][] arr){
        int max=arr[0][0];

        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if (max<arr[row][col])
                    max=arr[row][col];
            }
        }
        return max;
    }

    static int Min_in2dArray(int[][] arr){
        int min=arr[0][0];

        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if (min>arr[row][col])
                    min=arr[row][col];
            }
        }
        return min;
    }
}
