package Easy.Array;

public class RotatedArray {
    static void rotate(int[] nums, int k) { //TC -> O(n) , SC -> O(1)
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        reverse(nums, 0, n - 1); // Reverse entire array
        reverse(nums, 0, k - 1); // Reverse first k elements
        reverse(nums, k, n - 1); // Reverse remaining elements
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Array to rotate
        int k = 4; // Rotate it 4 times
        rotate(arr, k);

        // Corrected printing logic
        for (int val : arr) {
            System.out.print(val + " "); // Printing on the same line for clarity
        }
    }
}
