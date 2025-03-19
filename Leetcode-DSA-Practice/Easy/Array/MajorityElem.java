package Easy.Array;

public class MajorityElem {
    static int majorityFn(int[] nums) { //Moor's Voting algorithm  TC - O(n)
        int freq=0, ans=0;
        for(int i =0; i<nums.length; i++) {
            if(freq == 0) {
                ans = nums[i];
            }
            if(ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityFn(nums));
        
    }
}
