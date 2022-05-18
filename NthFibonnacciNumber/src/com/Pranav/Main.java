package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter N ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++)
        { int temp=b;
            b=a+b;
            a=temp;

            System.out.print(b+" ");//gives entire series till n

        }
        System.out.println();

        System.out.println(b+" ");//prints nth fibonacci number



    }
}
