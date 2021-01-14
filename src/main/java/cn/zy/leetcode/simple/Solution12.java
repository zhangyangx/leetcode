package cn.zy.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
 * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution12 {
    public static List<Boolean> prefixesDivBy5(int[] A) {
//        List<Boolean> res = new ArrayList<>();
//        for (int i = 0; i < A.length; i++) {
//            StringBuilder tmp = new StringBuilder();
//            tmp.append(A[0]);
//            for (int j = 1; j <= i; j++) {
//                tmp.append(A[j]);
//            }
//            res.add(Long.parseLong(tmp.toString(), 2) % 5 == 0);
//        }
//        return res;

        List<Boolean> list = new ArrayList<>();
        int prefix = 0;
        for (int value : A) {
            /*
             << 1 左移1位 相当于 prefix * 2
             此处在二进制上左移，相当于拼接参数，结果返回的是十进制，可以直接取余判断
             */
            prefix = ((prefix << 1) + value) % 5;
            list.add(prefix == 0);
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(prefixesDivBy5(new int[]{0, 1, 1}));
    }
}
