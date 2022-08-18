package com.shashwat.Bitwise;

public class PickOutTheNon_Duplicate
{
    public static void main (String[] args) {

        int[] arr = {2,3,4,1,2,1,3,6,6};
        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            num ^= arr[i];
        }

        System.out.println("The duplicate no. in the array is: " + num);
    }
}
