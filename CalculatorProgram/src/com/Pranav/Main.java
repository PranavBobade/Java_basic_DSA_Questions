package com.Pranav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);

        int ans=0;
        while(true)
        {
            //take the operator as input
            System.out.println("Enter the operator: ");
            char op =s.next().trim().charAt(0);
            if(op=='+' || op=='-'||op=='*'||op=='/'||op=='%')
            {
                //input two numbers
                System.out.println("Enter two numbers: ");
                int num1=s.nextInt();
                int num2=s.nextInt();

                if(op=='+')
                {
                    ans=num1+num2;
                }
                if(op=='-')
                {
                    ans=num1-num2;
                }
                if(op=='*')
                {
                    ans=num1*num2;
                }
                if(op=='/')
                {if(num2!=0)
                    ans=num1/num2;
                }
                if(op=='%')
                {
                    ans=num1%num2;
                }
            }
           else if(op=='x'||op=='X')
               break;
           else
               System.out.println("Invalid operation");
            System.out.println(ans);
        }

    }
}
