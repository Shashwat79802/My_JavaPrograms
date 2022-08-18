package com.shashwat.Bitwise;

public class Sol
{
    public static void main(String[] args) {

        System.out.println(addBinary("1011", "1010"));
    }

    public static String addBinary(String a, String b) {

        int a1 = a.length() - 1, b1 = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder("");

        while (a1 >= 0 || b1 >= 0) {

            int sum = carry;

            if (a1 >= 0)
                sum += a.charAt(a1--) - '0';

            if (b1 >= 0)
                sum += b.charAt(b1--) - '0';

            carry = (sum > 1)? 1 : 0;

            sb.append(sum % 2);
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
