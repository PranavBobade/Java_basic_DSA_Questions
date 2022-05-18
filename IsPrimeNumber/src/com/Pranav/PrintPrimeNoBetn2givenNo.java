package com.Pranav;

import java.util.Scanner;

public class PrintPrimeNoBetn2givenNo {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);


        for (int i = 2; i <100 ; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }

    }

    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0) {
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
