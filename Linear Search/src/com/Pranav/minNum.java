package com.Pranav;

public class minNum {
    public static void main(String[] args) {
        int a[]={34,5,56,6,77,8,8,8,9990,-7,65,90};
        System.out.println(min(a));

    }
    static int min(int[]arr)
    {    int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];

        }
        return min;
    }

}
