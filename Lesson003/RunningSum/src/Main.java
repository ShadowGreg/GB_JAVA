import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution soul = new Solution();
        int[] array = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(soul.runningSum(array)));

    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        int[] outArray = new int[nums.length];
        for (int i = 0; i < outArray.length; i++) {
            outArray[i] = getElementsSum(i, nums);
        }
        return outArray;
    }

    private int getElementsSum(int i, int[] nums) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum = sum + nums[j];
        }
        return sum;
    }
}