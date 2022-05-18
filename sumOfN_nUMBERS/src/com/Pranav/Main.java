package com.Pranav;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter numbers ");
        Scanner s=new Scanner(System.in);
        int res=0;
        int n=0;

        try {
            while (n != 'x') {
                n = s.nextInt();
                res = res + n;
            }
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println(res);
        }

    }
}
