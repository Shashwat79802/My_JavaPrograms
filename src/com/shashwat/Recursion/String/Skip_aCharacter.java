package com.shashwat.Recursion.String;

public class Skip_aCharacter{

//Method 1 :
//    public static void main(String[] args) {
//
//        String str = "baccad";
//        char toSkipChar = 'a';      //we want to skip char 'a' from the string str.
//        StringBuilder sb = new StringBuilder("");
//
//        System.out.println("The reduced string is: " + skip(str, toSkipChar, sb));
//    }
//
//    private static StringBuilder skip(String str, char ch, StringBuilder ans) {
//
//        if (str == "")
//            return ans;
//        else {
//            if (str.charAt(0) != ch) {
//                ans.append(str.charAt(0));
//            }
//            return skip(str.substring(1), ch, ans);
//        }
//    }
// ---------------------------------------------------------------------------------------------------------------------

//Method 1:
    public static void main(String[] args) {

        String str = "baccad";
        char ch = 'd';

        System.out.println("String is reduced to: " + skip(str, ch));
    }

    private static StringBuilder skip (String str, char ch) {

        StringBuilder ans = new StringBuilder("");

        if (str == "")
            return ans;

        if (str.charAt(0) != ch) {
            ans.append(str.charAt(0));
        }

        return ans.append(skip(str.substring(1), ch));
    }
}
