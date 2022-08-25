package com.shashwat.Recursion.Searching;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class LinearSearch_ForMultipleOccurrences {

//Method 1:

/*
    public static void main (String args[]) {

        int[] arr = {6, 2, 4, 1, 9, 5, 3};
        int target = 10;
        ArrayList<Integer> ans = new ArrayList<>();

        System.out.println("Target occurs at indices: " + search(arr, target, 0, ans));
    }

    static ArrayList<Integer> search(int[] arr, int target, int idx, ArrayList<Integer> ans) {

        if (arr.length == idx)
            return ans;

        if (arr[idx] == target) {
            ans.add(idx);
        }

        return search(arr, target, idx+1, ans);
    }
}
*/
//---------------------------------------------------------------------------------------------------------------------//
//Method 2 :

    public static void main (String args[]) {

        int[] arr = {6, 1, 3, 7, 8, 6, 2, 4, 1};
        int target = 6;

        System.out.println("Target is at indices : " + search(arr, target, 0));
    }

    static ArrayList<Integer> search (int[] arr, int target, int idx) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (idx == arr.length)
            return ans;

        if (arr[idx] == target)
            ans.add(idx);

        ArrayList<Integer> ansFromBelowCalls = search(arr, target, idx+1);

        ans.addAll(ansFromBelowCalls);

        return ans;
    }
}


