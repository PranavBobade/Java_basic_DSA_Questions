package com.Pranav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to check ");
        int t=s.nextInt();

        while(t>0)
        {  int a=s.nextInt();
           int b=a;
            int res=0;
            int rem=0;

            while(b>0)
            {
                rem=b%10;
                res=res+rem*rem*rem;
                b=b/10;
            }

            if(res==a)
                System.out.println(a+" is Armstrong Number");
            else
                System.out.println(a+" is not a Armstrong Number");

            t--;
        }
    }
}
