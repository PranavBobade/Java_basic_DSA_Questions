package com.Pranav;

public class linearSearch2 {
    public static void main(String[] args) {
        int a[]={34,5,56,6,77,8,8,8,9990,0,0,90};
        System.out.println(linearSearch(a,77));
    }
    static int linearSearch(int []arr,int target)
    { // search the target and return the element
        if(arr.length==0)
        {
            return Integer.MAX_VALUE;
        }
        // run for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target)
                return element;
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
}
