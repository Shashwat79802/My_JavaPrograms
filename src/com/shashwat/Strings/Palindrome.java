package com.shashwat.Strings;

public class Palindrome
{
    public static void main (String[] args)
    {
        String str = "";

        if (palin_Check(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }

    static boolean palin_Check (String arr)
    {
        int start = 0, end = arr.length() - 1;

        while (start <= end){

            if (arr.charAt(start) != arr.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
