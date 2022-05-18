package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);

//        for(int i=1;i<=n;i++)
//        {
//            if(n%i==0)
//                System.out.print(i+" ");
//        }
        int res=0;
        int max=0;
        while(true)
        {
            int n=s.nextInt();
            if(n!=0) {
                res = res + n;
                if (n > max) {
                    max = n;
                }
            }
            else
                break;

        }
        System.out.println(res);
        System.out.println(max);

    }
}
