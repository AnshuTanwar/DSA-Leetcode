package Medium.Array;

public class JumpGame {  // TC -> O(n), SC -> O(1);
    static boolean jump(int[] nums) {
        int maxReach = 0;
        for(int i=0; i<nums.length; i++) {
            if(i > maxReach) return false;
            maxReach = Math.max(maxReach, i+nums[i]);
            if(maxReach >= nums.length-1) return true;
        }
        return true;
    }
    public static void main(String args[]) {
        int[] nums = {2, 1, 1, 0, 4};
        System.out.println("The answer is : " + jump(nums));

    }
}
