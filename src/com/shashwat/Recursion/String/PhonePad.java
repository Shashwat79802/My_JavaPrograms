package com.shashwat.Recursion.String;

import java.util.*;

public class PhonePad
{
    public static void main (String[] args) {
        System.out.println(pad(" ", "12"));
    }

    static List<String> pad(String p, String up) {

        if (up.isEmpty()) {

            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0';
        List<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {

            char ch = (char)('a' + i);
            list.addAll(pad(p + ch, up.substring(1)));
        }
        return list;
    }
}
