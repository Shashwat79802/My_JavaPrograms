package com.shashwat.Independent;

import java.util.Scanner;

public class Prime {

    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a no. to check whether prime: ");
        int num = input.nextInt();

        int c = 2, prime = 0;

        if((num == 1) || (num == 0)){

            System.out.println("Neither prime nor composite");
        }
        else{

            while(c*c <= num){

                if (num%c==0){

                    System.out.println(num + " is not prime");
                    prime = 1;
                    break;
                }
                c++;

            }

            if (prime == 0){
                System.out.println(num + " is prime");
            }


        }
    }
}
