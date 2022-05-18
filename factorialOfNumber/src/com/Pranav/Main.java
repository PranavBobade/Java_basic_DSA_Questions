package com.Pranav;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int fact=1;
//        for(int i=1;i<=n;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println(fact);

        //power of a number
//        double res=Math.pow(n,3);
//        System.out.println(res);
        int res=1;
        for(int i=1;i<=3;i++)
        {
            res=res*n;
        }
        System.out.println(res);
    }
}
