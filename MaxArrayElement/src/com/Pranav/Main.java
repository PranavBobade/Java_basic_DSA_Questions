package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[]={3,5,66,67,8,89};

        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,4));
    }

     static int max(int[] arr) {
        if(arr.length==0)
        {
            return -1;
        }
        int max=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];

        }
        return max;
    }



    static int maxRange(int[] arr, int index1,int index2) {

//        if(index2>index1)
//        {
//            return -1;
//        }
//        if(arr==null)
//        {
//            return -1;
//        }
        int max=index1;
        for (int i = index1+1; i <=index2 ; i++) {
            if(arr[i]>max)
                max=arr[i];

        }
        return max;
    }
}
