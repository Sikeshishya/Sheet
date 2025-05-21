package Arrays;

public class maxlen0subarray {
    public static void main(String[] args) {

        int[] arr={41 ,-45, -44 ,-24, 20, 10, 44};
        System.out.println(maxLen(arr));
    }

    static int maxLen(int arr[]) {
        int count=0;
        for (int i = 0; i < arr.length ; i++) {

            int sum = 0;
            for (int j = i ; j < arr.length ; j++) {
                sum += arr[j];

                if (sum == 0) {
                    count = Math.max(count, j - i + 1);
                }

            }


        }

        return count;
    }
}
