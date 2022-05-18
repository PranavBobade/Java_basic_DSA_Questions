package com.Pranav;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int a[]={-18,-12,-4,0,2,4,6,9,11,12,14,20,36,48};
        int arr[]={90,75,18,12,6,4,3,1};
        int target=75;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static  int orderAgnosticBS(int []a,int target)
    {
        int start = 0;
        int end = a.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc=a[start]<a[end];

        while (start <= end) {

            // find the middle element
            //     int mid=(start+end)/2;   // might be possible that (start+end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if(a[mid]==target) {
                return mid;
            }
            if(isAsc) {
                if (target < a[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
            else
            {
                if (target > a[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
