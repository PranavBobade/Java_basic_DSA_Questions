package com.Pranav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner s=new Scanner(System.in);
//        String in=s.next();

        
//       int i=0, j=in.length()-1;
//       while(i<j)
//       {
//           if(in.charAt(i)!=in.charAt(j)) {
//               System.out.println(in + " is not palindrome");
//               break;
//           }
//           i++;
//           j--;
//           System.out.println(in+" is palindrome");
//           break;
//       }

        Scanner s=new Scanner(System.in);
        String in=s.next();
        StringBuffer out=new StringBuffer();
        for(int i=in.length()-1;i>=0;i--)
        {
            out=out.append(in.charAt(i));
        }
        if(in.equalsIgnoreCase(out.toString()))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not a palindrome");

    }
}
