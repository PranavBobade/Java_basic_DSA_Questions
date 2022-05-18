package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Enter Number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int res=0;

        for(int i=1;i<=10;i++)
        {
            res=num*i;
            System.out.println(num+"*"+i+"= " +res);
        }
    }
}
