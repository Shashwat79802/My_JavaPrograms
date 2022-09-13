package com.shashwat.Arrays.Searching;

public class Sol {

    // Simple binary search algorithm
    static int binarySearch(int[] arr, int start, int end, int target)
    {
        if (end>=start)
        {
            int mid = start + (end - start)/2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return binarySearch(arr, start, mid-1, target);

            return binarySearch(arr, mid+1, end, target);
        }
        return -1;
    }

    // Method takes an infinite size array and a key to be
    // searched and returns its position if found else -1.
    // We don't know size of arr[] and we can assume size to be
    // infinite in this function.
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE
    // THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
    static int findPos(int arr[],int target)
    {
        int start = 0, end = 1;
        int val = arr[0];

        // Find h to do binary search
        while (val < target)
        {
            start = end;	 // store previous high
            //check that 2*h doesn't exceeds array
            //length to prevent ArrayOutOfBoundException
            if(2*end < arr.length-1)
                end = 2*end;
            else
                end = arr.length-1;

            val = arr[end]; // update new val
        }
        // at this point we have updated low
        // and high indices, thus use binary
        // search between them
        return binarySearch(arr, start, end, target);
    }
}
