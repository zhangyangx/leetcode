package cn.zy.leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/minimum-absolute-difference/
 * 给你个整数数组 arr，其中每个元素都 不相同。
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution11 {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
//        List<List<Integer>> resList = new ArrayList<>();
//        Arrays.sort(arr);
//        int min = Integer.MIN_VALUE;
//        // 获取最小绝对差值
//        for (int i = 1; i < arr.length; i++) {
//            int i1 = arr[i - 1] - arr[i];
//            if (i1 > min) {
//                min = i1;
//            }
//        }
//        // 获取结果
//        for (int i = 1; i < arr.length; i++) {
//            int i1 = arr[i - 1] - arr[i];
//            if (min == i1) {
//                resList.add(Arrays.asList(arr[i - 1], arr[i]));
//            }
//        }
//        return resList;

        Arrays.sort(arr);
        List<List<Integer>> res = new LinkedList<>();
        int min = 99999999;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            // 找到新的最小差，清空原有结果
            if (tmp < min) {
                min = tmp;
                res.clear();
            }
            // 如果是最小差，记录
            if (tmp == min) {
                List<Integer> item = new ArrayList<>(2);
                item.add(arr[i - 1]);
                item.add(arr[i]);
                res.add(item);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{1, 2, 3, 4}));
    }
}
