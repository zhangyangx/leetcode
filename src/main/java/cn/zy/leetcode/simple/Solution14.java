package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 * 请你返回 words 数组中 一致字符串 的数目。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution14 {
    public static int countConsistentStrings(String allowed, String[] words) {
//        int res = 0;
//        for (String word : words) {
//            boolean flag = true;
//            for (int i = 0; i < word.length(); i++) {
//                flag = allowed.contains(String.valueOf(word.charAt(i)));
//                if (!flag) {
//                    break;
//                }
//            }
//            if (flag){
//                res ++;
//            }
//        }
//        return res;

        int res = 0;
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                flag = allowed.indexOf(word.charAt(i)) != -1;
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }
}
