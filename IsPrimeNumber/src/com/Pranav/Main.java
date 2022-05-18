package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        System.out.println(isPrime(n));
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
