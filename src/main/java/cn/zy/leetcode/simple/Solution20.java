package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 * 数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution20 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        StringBuilder s1 = new StringBuilder();
//        for (String s : word1) {
//            s1.append(s);
//        }
//
//        StringBuilder s2 = new StringBuilder();
//        for (String s : word2) {
//            s2.append(s);
//        }
//        return s1.toString().equals(s2.toString());

        return String.join("", word1).equals(String.join("", word2));
    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"a", "b"}, new String[]{"ab", "x"}));
    }
}
