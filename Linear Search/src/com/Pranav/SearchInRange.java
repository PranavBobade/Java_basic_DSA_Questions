package com.Pranav;

public class SearchInRange {
    public static void main(String[] args) {
        int a[]={34,5,56,6,77,8,8,8,9990,0,0,90};
        int target=0;
        System.out.println(linearSearch(a,target,0,4));
    }
    static int linearSearch(int []arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for (int i=start;i<end;i++)  {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
