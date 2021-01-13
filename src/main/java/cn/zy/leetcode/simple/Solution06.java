package cn.zy.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。
 * 注意，允许有多个孩子同时拥有 最多 的糖果数目。
 *
 * @author ZhangYang
 * @date 2021/1/13
 */
public class Solution06 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> result = new ArrayList<>();
//        for (int i = 0; i < candies.length; i++) {
//            int[] temp = Arrays.copyOf(candies, candies.length);
//            temp[i] = temp[i] + extraCandies;
//            result.add(temp[i] == Arrays.stream(temp).max().getAsInt());
//        }
//        return result;

//        List<Boolean> result = new ArrayList<>();
//        int max = Arrays.stream(candies).max().getAsInt();
//        for (int candy : candies) {
//            result.add(candy + extraCandies >= max);
//        }
//        return result;

        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{1, 1, 3, 5, 5, 2, 3}, 2));
    }
}
