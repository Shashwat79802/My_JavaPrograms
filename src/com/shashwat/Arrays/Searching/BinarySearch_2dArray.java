//Strictly sorted array is required...

package com.shashwat.Arrays.Searching;

import java.util.Arrays;

public class BinarySearch_2dArray
{
    public static void main (String[] args){

        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {10, 11, 12, 13}
        };

        System.out.println(Arrays.toString(binarySearch_2dArray(arr, 10)));
    }

    static int[] binarySearch_2dArray(int[][] arr, int target){

        int row = arr.length, col = arr[0].length;

        if (row == 1){
            return binarySearch(arr, target, 0, 0, col);
        }

        int rStart = 0, rEnd = row - 1, cMid = col/2;

        while (rStart < rEnd - 1){

            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target){
                return new int[] {mid, cMid};
            }
            else if (arr[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        if (arr[rStart][cMid] == target)
            return new int[] {rStart, cMid};

        if (arr[rEnd][cMid] == target)
            return new int[] {rEnd, cMid};

        if (target <= arr[rStart][cMid-1])
            return binarySearch(arr, target, rStart, 0, cMid-1);

        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][col-1])
            return binarySearch(arr,target, rStart, cMid+1, col-1);

        if (target <= arr[rEnd][cMid-1])
            return binarySearch(arr, target, rEnd, 0, cMid-1);

        else
            return binarySearch(arr,target, rEnd, cMid+1, col-1);
    }

    static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd){

        while (cStart <= cEnd){

            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target)
                return new int[] {row, mid};

            else if (arr[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }

        return new int[] {-1, -1};
    }
}