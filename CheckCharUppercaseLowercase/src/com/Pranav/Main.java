package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
         char c=s.next().trim().charAt(0);
         if(c>='A' && c<='Z')
             System.out.println("Uppercase");
         else if(c>='a' && c<='z')
             System.out.println("Lowercase");


    }
}
