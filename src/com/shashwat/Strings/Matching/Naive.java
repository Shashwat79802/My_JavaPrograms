package com.shashwat.Strings.Matching;

public class Naive
{
    public static void main (String[] args)
    {
        String text = "100100011101010000";
        String pattern = "00";

        naive_match(text, pattern);
    }

    static void naive_match(String text, String pattern)
    {
        int n = text.length(), m = pattern.length();

        for (int s = 0; s <= n - m; s++){
            int j = 0;

            for (j = 0; j < m; j++){

                if (text.charAt(s+j) != pattern.charAt(j))
                    break;
            }

            if (j == m)
                System.out.println("Pattern occurs from index " + s);

        }
    }
}
