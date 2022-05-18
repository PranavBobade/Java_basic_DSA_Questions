package com.Pranav;

public class PrintNoOfArmstrongNumberInGivenRange {
    public static void main(String[] args) {
        //printing all 3 digit armstrong numbers
        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }
    static boolean isArmstrong(int n)
    {
        int b=n;
        int res=0;
        int rem=0;

        while(b>0)
        {
            rem=b%10;
            res=res+rem*rem*rem;
            b=b/10;
        }
return n==res;

    }
}
