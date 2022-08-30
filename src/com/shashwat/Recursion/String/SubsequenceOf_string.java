package com.shashwat.Recursion.String;

import java.util.ArrayList;

public class SubsequenceOf_string
{
    //Method 1:
//    public static void main(String[] args) {
//        String str = "abc";
//        subsequence(new String(""), str);
//    }
//
//    private static void subsequence(String up, String p) {
//
//        if (p.isEmpty()) {
//            System.out.print(up + " ");
//            return;
//        }
//
//        subsequence(up + p.charAt(0), p.substring(1));      //take it
//        subsequence(up, p.substring(1));                       //ignore it
//    }

    //------------------------------------------------------------------------------------------------------------------

    public static void main (String[] args) {
        ArrayList<String> ans = subsequence( "", "abc");
        ans.remove(ans.size()-1);
        System.out.println(ans);
    }

    private static ArrayList<String> subsequence(String up, String p) {

        if (p.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }

        ArrayList<String> left = subsequence(up + p.charAt(0), p.substring(1));
        ArrayList<String> right = subsequence(up, p.substring(1));

        left.addAll(right);
        return left;
    }
}
