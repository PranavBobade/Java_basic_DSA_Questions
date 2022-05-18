package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int sum=0;

        for (int i = 1; i < n; i++) {
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not a perfect number");

    }
}
