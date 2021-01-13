package cn.zy.leetcode.simple;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 *
 * @author ZhangYang
 * @date 2021/1/12
 */
public class Solution02 {
    public static int[] runningSum(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int r = nums[i];
//            for (int j = 0; j < i; j++) {
//                r += nums[j];
//            }
//            result[i] = r;
//        }
//        return result;

        // 从数组索引1开始,因为数组索引0的数不用变
        for (int i = 1; i < nums.length; i++) {
            // 比如数组索引4位置,就是和数组索引3位置的数相加,因为数组索引三已经是和前面的数相加过的和,所以直接和他相加就行
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3})));
    }
}
