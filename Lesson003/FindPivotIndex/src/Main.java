public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 7, 3, 6, 5, 6};
        Solution sol = new Solution();
        System.out.println(sol.pivotIndex(array));
    }

}

class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum;
        int leftSum;
        for (int i = 0; i < nums.length; i++) {
            rightSum = getRightSum(nums, i);
            leftSum = getLeftSum(nums, i);
            if (isPivot(rightSum, leftSum))
                return i;
        }

        return -1;
    }

    private boolean isPivot(int rightSum, int leftSum) {
        if (rightSum == leftSum)
            return true;
        return false;
    }

    private int getRightSum(int[] nums, int i) {
        int sumLeft = 0;
        for (int j = i + 1; j < nums.length; j++) {
            sumLeft = sumLeft + nums[j];
        }
        return sumLeft;
    }

    private int getLeftSum(int[] nums, int i) {
        int sumRight = 0;
        for (int j = 0; j <= i - 1; j++) {
            sumRight = sumRight + nums[j];
        }
        return sumRight;
    }
}
