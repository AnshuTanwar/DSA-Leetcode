package Medium.Array;

public class TwoSumII {
    static int[] twoSum(int[] numbers, int target) { //TC - O(n), SC - O(1);
        int start = 0;
        int end = numbers.length-1;
        while(start < end) {
            if(numbers[start] + numbers[end] == target) {
                return new int[] {start+1, end+1};
            }
            if(numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] {start+1, end+1};
    }
    public static void main(String args[]) {
        int[] numbers = {2, 7, 9, 11};
        int target = 9;
        System.out.println(twoSum(numbers, target));

    }
}
