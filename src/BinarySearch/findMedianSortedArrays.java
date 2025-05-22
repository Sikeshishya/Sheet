package BinarySearch;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class findMedianSortedArrays {

    public int[] mergesort(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;


    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] arr=new int[nums1.length+nums2.length];

        arr=mergesort(nums1,nums2);

        int low=0;
        int high=arr.length-1;
        if(arr.length%2==0)
        {
            double mid1=arr[arr.length/2 -1];
            double mid2=arr[arr.length/2];

            return (mid1+mid2)/2;

        }
        return arr[arr.length / 2];
    }
}
