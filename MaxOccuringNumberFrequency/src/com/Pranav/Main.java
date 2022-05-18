package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int count=0;
//        while (n>0)
//        {
//            int rem=n%10;
//            n=n/10;
//            if(rem==3)
//                count++;
//        }
//        System.out.println(count);

        String in=Integer.toString(n);
        System.out.println(in);
        int count=0;
        for(int i=0;i<in.length();i++)
        {
            if(in.charAt(i)=='8')
                count++;
        }
        System.out.println(count);
    }
}
