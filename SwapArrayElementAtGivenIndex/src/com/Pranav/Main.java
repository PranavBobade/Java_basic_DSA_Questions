package com.Pranav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr={34,5,6,7,78,98,89};
        System.out.println(  Arrays.toString(arr));

        swap(arr, 3,5);
        System.out.println(  Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr ,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;

        }
    }
}
