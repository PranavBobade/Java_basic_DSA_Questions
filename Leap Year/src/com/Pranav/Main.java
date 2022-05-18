package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a Year");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " is Leap Year");
        else
            System.out.println(year + " is not Leap Year");
    }
}
