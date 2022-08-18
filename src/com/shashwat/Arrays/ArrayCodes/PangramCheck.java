package com.shashwat.Arrays.ArrayCodes;

public class PangramCheck
{
    public static void main(String[] args){

        String sen = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sen));
    }

    static public boolean checkIfPangram(String sentence) {
        boolean bool = true;
        int[] arr = new int[26];

        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                arr[sentence.charAt(i)-97] += 1;
            }
        }
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0)
                bool = false;
        }
        return bool;
    }
}

