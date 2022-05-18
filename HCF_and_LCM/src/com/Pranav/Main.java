package com.Pranav;

import java.util.Scanner;

/*static int gcd(int a, int b)
        {
        if (a == 0)
        return b;
        return gcd(b % a, a);
        }

// method to return LCM of two numbers
static int lcm(int a, int b)
        {
        return (a / gcd(a, b)) * b;
        }
Time Complexity: O(log(max(a,b))
Auxiliary Space: O(log(max(a,b))
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter two numbers:");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int res=m*n;
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;

        }
        System.out.println("HCF IS "+m+" LCM IS "+(res/m));
    }
}
