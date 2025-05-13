package BinarySearch;

public class BinarySerach {

    public static void main(String[] args) {
    int[] nums={-1,0,3,5,9,12};
        System.out.println(BinarySerach(nums,9));
    }

    static int BinarySerach(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;


    }
}
