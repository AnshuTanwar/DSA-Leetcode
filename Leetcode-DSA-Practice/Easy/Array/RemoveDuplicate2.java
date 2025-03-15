package Easy.Array;

public class RemoveDuplicate2 {
    static int removeDuplicate(int nums[]) { //TC => O(n); SC => O(1);
        int i = 2; 
        for(int j = 2; j < nums.length; j++) {
            if(nums[j] != nums[i-2]) { //checking the condition of atmost two
                nums[i] = nums[j];
                i += 1; 
            }
        }
        //base case
        if(nums.length <= 2) {
            return nums.length;
        }
        return i;
    }
    public static void main(String args[]) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5};
        int ans = removeDuplicate(nums);
        System.out.println(ans);

    }
}
