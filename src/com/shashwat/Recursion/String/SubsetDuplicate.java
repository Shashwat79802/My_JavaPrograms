package com.shashwat.Recursion.String;

import java.util.*;

public class SubsetDuplicate {

    public static void main (String[] args) {

        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate2(arr);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }

    /*
    In the below function, after adding the element in the inner ArrayList and before adding it to the outer ArrayList,
    using a for-each loop, I'm checking that if the element is already present in the outer ArrayList or not.
    */
    static List<List<Integer>> subsetDuplicate1(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        Arrays.sort(arr);

        for (int ele : arr) {

            int n = outer.size();
            for (int i = 0; i < n; i++) {

                List<Integer> inner = new ArrayList<>();
                inner.addAll(outer.get(i));
                inner.add(ele);

                boolean notEqual = true;
                for (List<Integer> list : outer) {
                    if (list.equals(inner)) {
                        notEqual = false;
                        break;
                    }
                }

                if (notEqual)
                    outer.add(inner);
            }
        }
        return outer;
    }

    /*
    In the below function, first I'm checking if the current element is same as the previous element in the array, if it
    is present, then the duplicate value is added to second half of the arraylist not the first half because the previous
    same element has been already added to the first half & adding it again in the first half will now create duplicate
    elements in the answer list and now the second half doesn't contain any combination of the current duplicate element,
    so it will be added into the second half of the arraylist to create a new combination.
     */
    static List<List<Integer>> subsetDuplicate2(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        Arrays.sort(arr);

        for (int idx = 0; idx < arr.length; idx++) {

            int n = outer.size();
            int start = 0;
            if (idx > 0 && arr[idx] == arr[idx-1]) {
                start = n/2;
            }

            for (int i = start; i < n; i++) {

                List<Integer> inner = new ArrayList<>();
                inner.addAll(outer.get(i));
                inner.add(arr[idx]);
                outer.add(inner);
            }
        }
        return outer;
    }


}
