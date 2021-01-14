package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 * 给你两个整数，n 和 start 。
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution13 {
    public static int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; i++) {
            res ^= start + 2 * i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(1, 7));
    }
}
