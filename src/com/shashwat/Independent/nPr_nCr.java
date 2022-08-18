package com.shashwat.Independent;

import java.util.Scanner;

public class nPr_nCr
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        float ans;

        while (true)
        {
            System.out.print("\n1.nPr   2.nCr   3.X or exit: ");
            char input = in.next().trim().charAt(0);

            if (input == '1' || input == '2') {
                System.out.print("Enter n & r: ");
                int n = in.nextInt();
                int r = in.nextInt();
                int n1 = n, r1 = r;

                if (n >= r) {
                    if (input == '1') {
                        int n_fact = 1, n_rFact = 1, a = n - r;
                        while (n != 0) {
                            n_fact *= n;
                            n--;
                        }
                        while (a != 0) {
                            n_rFact *= a;
                            a--;
                        }
                        ans = (float) (n_fact) / n_rFact;
                        System.out.print(n1 + "P" + r1 + " = " + ans);
                        System.out.println();
                    }
                    else if (input == '2') {
                        int n_fact = 1, n_rFact = 1, a = n - r, r_fact = 1;
                        while (n != 0) {
                            n_fact *= n;
                            n--;
                        }
                        while (a != 0) {
                            n_rFact *= a;
                            a--;
                        }
                        while (r != 0) {
                            r_fact *= r;
                            r--;
                        }
                        ans = (float) (n_fact) / (n_rFact * r_fact);
                        System.out.print(n1 + "C" + r1 + " = " + ans);
                        System.out.println();
                    }
                }
                else
                    System.out.println("r can't be greater than n, try again!!!");
            }
            else if (input == 'x' || input == 'X')
                break;

            else{
                System.out.print("\nInvalid Input, Try Again!!!");
                System.out.println();
            }
        }
    }
}
