package com.Pranav;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int [][]arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target=0;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max(arr));
    }
    static int[] search(int [][]a,int target)
    {
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==target)
                    return new int []{i,j};
            }
        }
        return new int []{-1,-1};
    }

    static int max(int [][]a)
    {  int max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max)
                    max=a[i][j];
            }
        }
        return max;
    }


}
