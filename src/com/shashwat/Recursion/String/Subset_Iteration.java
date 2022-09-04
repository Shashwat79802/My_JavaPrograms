package com.shashwat.Recursion.String;

import java.util.*;

public class Subset_Iteration {
    public static void main (String[] args) {

        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subset(arr);

        for (List<Integer> inner : ans) {
            System.out.print(inner + " ");
        }
    }

    static List<List<Integer>> subset(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {

            int n = outer.size();
            for (int i = 0; i < n; i++) {

                List<Integer> inner = new ArrayList<>();
                inner.addAll(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

}
