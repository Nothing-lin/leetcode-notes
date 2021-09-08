/**
 * 我的难点：
 * 1、如何获取输入值？
 * 2、如何获取数组坐标？
 */

public class twoSum_1 {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] twoSum = twoSum(nums, target);
        for (int i = 0; i < twoSum.length; i++) {
            System.out.print(twoSum[i]);
        }

    }
}
