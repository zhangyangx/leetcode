package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/na-ying-bi/
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution17 {

    public static int minCount(int[] coins) {
        int res = 0;
        for (int coin : coins) {
            if (coin % 2 != 0) {
                res += coin / 2 + 1;
            } else {
                res += coin / 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minCount(new int[]{1,1,1}));
    }

}
