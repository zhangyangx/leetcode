package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 * 给你一个整数数组 nums 。
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * 返回好数对的数目。
 *
 * @author ZhangYang
 * @date 2021/1/13
 */
public class Solution04 {
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }
}
