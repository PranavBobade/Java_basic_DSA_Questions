package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

//        int max=a;
//        if(b>max)
//            max=b;
//        if(c>max)
//            max=c;
//----------------------------------
//        int max=0;
//        if(a>b) {
//            max = a;
//        }
//        else {
//            max = b;
//        }
//        if(c>max)
//        {
//            max=c;
//        }
//------------------------------------------------------
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
