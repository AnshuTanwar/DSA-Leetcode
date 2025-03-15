package Easy.Array;

public class MergeSortedArr {
    public static void main(String args[]) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        // merge1(nums1, m, nums2, n);
        // for(int i=0; i<nums1.length; i++) {
        //     System.out.print(nums1[i] );
        // }
        merge2(nums1, m, nums2, n);
        for(int i=0; i<nums1.length; i++) {
            System.out.print( nums1[i]);
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        //TC => O(m+n);  SC => O(m+n); more space complexity due to use of extra space for creating exxtra array
        int arr[] = new int[m + n];
        int idx = 0; // Index for the merged array

        // Add elements from nums1
        int i = 0, j = 0; // Pointers for nums1 and nums2
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[idx++] = nums1[i++];
            } else {
                arr[idx++] = nums2[j++];
            }
        }

        // Add remaining elements from nums1 (if any)
        while (i < m) {
            arr[idx++] = nums1[i++];
        }

        // Add remaining elements from nums2 (if any)
        while (j < n) {
            arr[idx++] = nums2[j++];
        }

        // Copy merged array back to nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = arr[k];
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        //TC => O(m+n);  SC => O(1); no exrta space was used 
        int i=m-1, j=n-1, k=m+n-1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}