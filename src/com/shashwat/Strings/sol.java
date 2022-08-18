package com.shashwat.Strings;

import java.util.Arrays;

public class sol
{
    public static void main(String[] args) {

        String s = "Let's have fun tonight";
//        System.out.println((s));
        System.out.println(reverseWords(s));
    }

    static public String reverseWords(String s) {

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = reverse(arr[i]);
        }

        StringBuilder sb = new StringBuilder(" ");

        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[arr.length-1]);

        return new String(sb);
    }

    static public String reverse (String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = str.length() - 1; i > -1; i--){
            sb.append(str.charAt(i));
        }

        return new String(sb);
    }


}

