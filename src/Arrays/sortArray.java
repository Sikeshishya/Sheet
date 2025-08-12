package Arrays;

import java.util.Arrays;

import static java.util.Collections.swap;

public class sortArray {

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        quicksort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public int[] sortArray(int[] nums) {
        quicksort(nums,0, nums.length-1);
        return nums;


    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);

        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);

        return j;


    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
