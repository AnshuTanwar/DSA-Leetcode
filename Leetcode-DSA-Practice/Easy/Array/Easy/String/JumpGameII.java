package Medium.Array;

public class JumpGameII {  // TC -> O(n), SC -> O(1);
    static int jump(int[] nums) {
        int maxReach = 0;
        int jump = 0;
        int end = 0;
        for(int i=0; i<nums.length; i++) {
            maxReach = Math.max(maxReach, i+nums[i]);
            if(i == end) {
                jump++;
                end = maxReach;
                if(end >= nums.length-1) break;
            }
            
        }
        return jump;
    }
    public static void main(String args[]) {
        int[] nums = {2, 1, 1, 0, 4};
        System.out.println("The answer is : " + jump(nums));

    }
}
