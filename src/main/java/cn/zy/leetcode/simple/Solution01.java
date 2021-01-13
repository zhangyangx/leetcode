package cn.zy.leetcode.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/richest-customer-wealth/
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。
 * 返回最富有客户所拥有的 资产总量 。
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 *
 * @author zy
 * @date 2020/11/6 14:34
 */
public class Solution01 {
    public static int maximumWealth(int[][] accounts) {
        List<Integer> list = new ArrayList<>(accounts.length);
        for (int[] account : accounts) {
            int j = 0;
            for (int i : account) {
                j += i;
            }
            list.add(j);
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
    }
}
