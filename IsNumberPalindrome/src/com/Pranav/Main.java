package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);

        int n=s.nextInt();
        int rem=0;
        int res=0;
        int a=n;
        while(a>0)
        {
         rem=a%10;
         res=res*10+rem;
         a=a/10;
        }
        if(res==n)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not a palindrome");

    }
}
