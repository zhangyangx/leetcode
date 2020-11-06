package cn.zy.leetcode.day01;

import java.util.*;

/**
 * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 * 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
 *
 * @author zy
 * @date 2020/11/6 14:34
 */
public class Solution01 {
    public static int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i : arr) {
            int tem = i;
            int count = 0;
            while (tem != 0) {
                count += tem % 2;
                tem = tem >> 1;
            }
            List<Integer> list = map.getOrDefault(count, new ArrayList<>());
            list.add(i);
            map.put(count, list);
        }
        int[] res = new int[arr.length];
        int index = 0;
        for (int k : map.keySet()) {
            List<Integer> list = map.get(k);
            Collections.sort(list);
            for (Integer integer : list) {
                res[index++] = integer;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] newArr = new int[]{1111, 7644, 1107, 6978, 8742, 1, 7403, 7694, 9193, 4401, 377, 8641, 5311, 624, 3554, 6631};
        int[] ints = sortByBits(newArr);
        System.out.println(Arrays.toString(ints));
    }
}
