package com.Pranav;

public class Main {

    public static void main(String[] args) {
        int a[]={34,5,56,6,77,8,8,8,9990,0,0,90};
        System.out.println(linearSearch(a,89));
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1


    static int linearSearch(int []arr,int target)
    {
     if(arr.length==0)
     {
         return -1;
     }
     // run for loop
        for (int index = 0; index <arr.length ; index++) {
            // check for element at every index if it is = target
            if(arr[index]==target)
                return index;
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
