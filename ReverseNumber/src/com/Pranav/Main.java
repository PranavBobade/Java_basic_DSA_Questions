package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        int res=0;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            res=res*10+rem;
        }
        System.out.println(res);
    }
}
