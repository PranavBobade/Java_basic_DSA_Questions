package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        char a=s.next().trim().toLowerCase().charAt(0);

        switch (a) {
            case 'a', 'u', 'e', 'i', 'o' -> System.out.println("vowel");
            default -> System.out.println("consonant");
        }

    }
}
