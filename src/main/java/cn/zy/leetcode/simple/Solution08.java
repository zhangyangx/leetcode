package cn.zy.leetcode.simple;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/shuffle-the-array/
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * @author ZhangYang
 * @date 2021/1/13
 */
public class Solution08 {
    public static int[] shuffle(int[] nums, int n) {
//        int[] start = Arrays.copyOfRange(nums, 0, n);
//        int[] end = Arrays.copyOfRange(nums, n, 2 * n);
//        int[] ints = new int[2 * n];
//        for (int i = 0; i < 2 * n; i += 2) {
//            ints[i] = start[i / 2];
//            ints[i + 1] = end[i / 2];
//        }
//        return ints;

        int[] ints = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ints[i * 2] = nums[i];
            ints[i * 2 + 1] = nums[n + i];
        }
        return ints;
    }

    public static void main(String[] args) {
//        int[] ints = {1, 2, 3, 4, 5, 6};
//        int[] ints1 = Arrays.copyOfRange(ints, 0, ints.length / 2);
//        System.out.println(Arrays.toString(ints1));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(ints, ints.length/2,ints.length )));
        System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
    }
}
