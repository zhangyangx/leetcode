package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/decode-xored-array/
 * 未知 整数数组 arr 由 n 个非负整数组成。
 * 经编码后变为长度为 n - 1 的另一个整数数组 encoded ，其中 encoded[i] = arr[i] XOR arr[i + 1] 。例如，arr = [1,0,2,1] 经编码后得到 encoded = [1,2,3] 。
 * 给你编码后的数组 encoded 和原数组 arr 的第一个元素 first（arr[0]）。
 * 请解码返回原数组 arr 。可以证明答案存在并且是唯一的。
 *
 * @author ZhangYang
 * @date 2021/1/12
 */
public class Solution03 {
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = encoded[i - 1] ^ arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(decode(new int[]{1, 2, 3}, 1)));
        System.out.println(1|2);
    }

}
