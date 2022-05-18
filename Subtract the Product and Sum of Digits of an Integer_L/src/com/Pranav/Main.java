package com.Pranav;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        int res1=1;
        int res2=0;
        int res=0;
        while(n>0)
        {
            rem=n%10;
            res1=res1*rem;
            res2=res2+rem;
            n=n/10;
        }
        res=res1-res2;
        System.out.println(res);
    }
}
