package com.Pranav;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
//        int a[] = new int[5];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i]=s.nextInt();
//
//        }
//        for (int x: a){
//            System.out.print(x+" ");
        int a[][]=new int[3][];
          a[0]=new int [2];
          a[1]=new int [3];
          a[2]=new int [4];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {// j will go till size of row
                a[i][j]=s.nextInt();

            }
            System.out.println();

        }
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(Arrays.toString(a[i]));
//
//        }

        for(int x[]:a)
        {
            System.out.println(Arrays.toString(x));
        }
        }

}
