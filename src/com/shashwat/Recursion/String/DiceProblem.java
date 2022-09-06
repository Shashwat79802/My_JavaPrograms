package com.shashwat.Recursion.String;

import java.util.*;
/*
A no. will be given, list out all the combination to form the string which will add-up and give the result as the no.
 */


public class DiceProblem
{
    public static void main (String[] args) {
        System.out.println(diceSum(" ", 4));
    }

    static List<String> diceSum(String p, int target) {

        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
                ans.addAll(diceSum((p + i), target-i));
        }
        return ans;
    }
}
