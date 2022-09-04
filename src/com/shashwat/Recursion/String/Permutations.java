package com.shashwat.Recursion.String;

import java.util.*;

public class Permutations {
    public static void main (String[] args) {

        System.out.println(permutationList("", "abc"));
    }

    static void permutation(String p, String up) {

        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }


    static List<String> permutationList(String p, String up) {

            if (up.isEmpty()) {
                List<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            List<String> ans = new ArrayList<>();

            char ch = up.charAt(0);
            for (int i = 0; i <= p.length(); i++) {
                String f = p.substring(0, i);
                String s = p.substring(i, p.length());
                ans.addAll(permutationList(f + ch + s, up.substring(1)));
            }
            return ans;
    }

}
