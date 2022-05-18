package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);

        String in=s.next();
        for (int i =in.length()-1; i>=0; i--) {
            System.out.print(in.charAt(i));
        }

    }
}
